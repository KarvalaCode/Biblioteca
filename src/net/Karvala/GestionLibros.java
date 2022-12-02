package net.Karvala;

import javax.swing.*;
import java.security.KeyStore;
import java.util.List;
import java.util.Optional;

class GestionLibros implements GestionPublicaDeLibros {


    private List<Libro> biblioteca;
    //Creamos los objetos de busqueda, input y put
    private Busqueda busqueda;
    Input in = new Input();
    Output out = new Output();
    Post post;
    Put put;

    public GestionLibros(List<Libro> biblioteca) {
        this.biblioteca = biblioteca;
        this.put = new Put(biblioteca);
        this.busqueda = new Busqueda(biblioteca);
        this.post = new Post(biblioteca);
    }

    //Buscar un libro segun la opcion
//    public List<Libro> buscarLibro(){
//        Opcion elegirBuscar = in.menu();
//        List<Libro> listaBuscada = busqueda.buscar(elegirBuscar);
//        System.out.println("El/los Libro/s que has buscado es/son: " + listaBuscada);
//        //out.mensaje();
//        return listaBuscada;
//    }

    // Buscar libro segúnla opcion
    public List<Libro> buscarLibro(Opcion opcion) {
        List<Libro> librobuscado = busqueda.buscar(opcion);
        if (librobuscado.isEmpty()) {
            out.mensajeNOExiste();
        }
        return librobuscado;
    }

    //Métodos (Get / Get ON / Post / Put / Delete)

    //Imprimir libro por pantalla (GET)
    @Override
    public Optional<Libro> get(int id) {
        return biblioteca.stream().filter(libro -> libro.getId() == id).findAny();
    }

    //Imprimir todos los libros por pantalla (GET ON)

    public List<Libro> getBiblioteca() {
        biblioteca.forEach(System.out::println);
        return biblioteca;
    }

    //Introducir libros nuevos en la biblioteca (POST)
    @Override
    public Libro post(Libro libro) {
        biblioteca.add(libro);
        return libro;
    }

    // Editar un atributo concreto del libro (PUT)
    @Override
    public Libro put(int id, Libro updatedLibro) {
        return updatedLibro;
    }

    // Eliminar un libro por id (DELETE)
    @Override
    public boolean delete(int id) {
        return biblioteca.removeIf(libro -> libro.getId() == id);
    }


}