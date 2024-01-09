package net.Karvala.Biblioteca;

import net.Karvala.Biblioteca.entities.Libro;
import net.Karvala.Biblioteca.repositories.LibroRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(BibliotecaApplication.class, args);
		LibroRepository repository = context.getBean(LibroRepository.class);

	//Los métodos CRUD se harian en un Controller y se llamarían desde UN Service
	//Crear Libro
	Libro l1 = new Libro(null, "Título", "Autoría", "Salón");
	Libro l2 = new Libro(null, "Título2", "Autoría2", "Salón2");
	Libro l3 = new Libro(null, "Título3", "Autoría3", "Salón3");

	//Guardar Libro
	System.out.println("Número de libros en la BBDD: " + repository.findAll().size());
	repository.save(l1);
	repository.save(l2);
	repository.save(l3);

	//Recuperar  biblioteca
	System.out.println("Número de libros en la BBDD: " + repository.count());
	System.out.println("Número de libros en la BBDD: " + repository.findAll().size());


		//Borrar Libro
	repository.deleteById(1L);
	System.out.println("Número de libros en la BBDD: " + repository.findAll().size());

	}
}
