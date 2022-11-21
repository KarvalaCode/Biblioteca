package net.Karvala;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class GestionLibros { //implements GestionPublicaDeLibros

    private List<Libro> biblioteca;
    //Creamos los objetos de busqueda, input y put
    private Busqueda busqueda;
    Input in = new Input();
    //Output out = new Output();
    private Post post;
    private Put put; //TODO probar  = new Put(biblioteca); y no instanciar en el constructor

    public GestionLibros(List<Libro> biblioteca){
       this.biblioteca = biblioteca;
       this.put = new Put(biblioteca);
       this.busqueda = new Busqueda(biblioteca);
       this.post = new Post(biblioteca);
        }

    //Buscar un libro segun la opcion
    public List<Libro> buscarLibro(){
        Opcion elegirBuscar = in.menu();
        List<Libro> listaBuscada = busqueda.buscar(elegirBuscar);
        System.out.println("El/los Libro/s que has buscado es/son: " + listaBuscada);
        //out.mensaje();
        return listaBuscada;
    }

    //Métodos (Get / Get ON / Post / Delete)

    //Imprimir libro por pantalla (GET)
    public void getLibro(Libro libro) {
        System.out.println(libro);
    }

    //Imprimir todos los libros por pantalla (GET ON)

    public List<Libro> getBiblioteca() {
        biblioteca.forEach(System.out::println);
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
        return biblioteca;

    }

        //Introducir libros nuevos en la biblioteca (POST)


        // Editar un atributo concreto del libro (PUT)
        public void putLibro (int id, Libro updatedLibro) {
            Opcion elegirEditar = in.menuEditar();
            System.out.println(elegirEditar);
            put.put(elegirEditar);
        }

        // Eliminar un libro por id
        public void deleteLibro ( int id){
            biblioteca.removeIf(libro -> libro.getId() == id);
        }

    //@Override
    public Optional<Libro> get(int id) {
        return biblioteca.stream().filter(libro -> libro.getId() == id).findFirst();
        //Libro libro = biblioteca.get(id);
    //return libro;
    }
//
//    @Override
    public Libro post(Libro libro) {
        biblioteca.add(libro);
        return libro;
    }
//
//    @Override
//    public Libro put(int id, Libro libro) {
//        return null;
//    }
//
//    @Override
//    public boolean delete(int id) {
//        return false;
//    }
}