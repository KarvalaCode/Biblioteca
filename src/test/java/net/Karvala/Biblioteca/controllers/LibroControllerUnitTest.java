package net.Karvala.Biblioteca.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.Karvala.Biblioteca.entities.Libro;
import net.Karvala.Biblioteca.repositories.LibroRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LibroControllerUnitTest {

    private LibroRepository libroRepositoryMock;
    private LibroController libroController;
    private Long testId = 7L;
    private List<Libro> testList = new ArrayList<Libro>();
    private Libro testLibro1 = new Libro();
    private Libro testLibro2 = new Libro();
    private Libro testLibro3 = new Libro();
    private Libro testLibro4 = new Libro(null, "testTitulo", "testAutor", "testEstanteria" );
    private Libro testLibro5 = new Libro(1L,  "testTitulo", "testAutor", "testEstanteria" );
    private Libro testLibro6 = new Libro(1L,  "testTitulo", "testAutor6", "testEstanteria" );


    @BeforeAll
    public void setUp() {
        libroRepositoryMock = mock(LibroRepository.class);
        libroController = new LibroController(libroRepositoryMock);

    }

    @Test
    public void findByIdValid() {
        //Given
        testLibro1.setId(1L);

        //When
        when(libroRepositoryMock.findById(testId)).thenReturn(Optional.of(testLibro1));
        ResponseEntity<Libro> findResult = libroController.findById(testId);

        //Then
        assertThat(findResult.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(findResult.getBody()).isEqualTo(testLibro1);
    }

    @Test
    public void findByIdNotFound() {
        when(libroRepositoryMock.findById(testId)).thenReturn(Optional.empty());
        ResponseEntity<Libro> response = libroController.findById(testId);
        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
    }

    @Test
    public void findAllValid() {
        testLibro1.setId(1L);
        testLibro2.setId(2L);
        testLibro3.setId(3L);
        testList.add(testLibro1);
        testList.add(testLibro2);
        testList.add(testLibro3);

        //When
        when(libroRepositoryMock.findAll()).thenReturn(testList);
        List<Libro> response = libroController.findAll();

        //Then
        assertEquals(response, testList);
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void postValid() throws Exception {
        String requestJson = new ObjectMapper().writeValueAsString(testLibro4);

        //When
        when(libroRepositoryMock.save(testLibro4)).thenReturn(testLibro4);
        ResponseEntity<Libro> response = libroController.post(testLibro4);

        //Then
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(testLibro4, response.getBody());
        verify(libroRepositoryMock, times(1)).save(testLibro4);
    }

    @Test
    public void postInvalid() {

        //When
        ResponseEntity<Libro> response = libroController.post(testLibro5);

        //Then
        //assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        //verify(libroRepositoryMock, times(0)).save(testLibro5);
    }

    @Test
    public void putValid() throws Exception {

            //Given
            when(libroRepositoryMock.existsById(testId)).thenReturn(true);
            when(libroRepositoryMock.save(testLibro1)).thenReturn(testLibro1);
            MockMvc mockMvc = MockMvcBuilders.standaloneSetup(libroController).build();

            //When
            mockMvc.perform(put("/api/libros")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(new ObjectMapper().writeValueAsString(testLibro4)));

    }

    @Test
    public void deleteByIdValid() {

        // When
        when(libroRepositoryMock.existsById(testId)).thenReturn(true);
        ResponseEntity<Libro> deleteResult = libroController.delete(testId);

        // Then
        verify(libroRepositoryMock).deleteById(testId);
        assertThat(deleteResult.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
    }

    @Test
    public void deleteNotFound() {
        // When
        when(libroRepositoryMock.existsById(testId)).thenReturn(false);
        ResponseEntity<Libro> deleteResult = libroController.delete(testId);

        // Then
        assertThat(deleteResult.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    public void deleteAllValid() {

        // When
        libroController.deleteAll();

        // Then
        verify(libroRepositoryMock).deleteAll();
        ResponseEntity<Libro> response = libroController.deleteAll();
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }

    @Test
    public void deleteAllNotFound() {
        // When
        when(libroRepositoryMock.existsById(testId)).thenReturn(false);
        ResponseEntity<Libro> deleteResult = libroController.delete(testId);

        // Then
        assertThat(deleteResult.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }



}
