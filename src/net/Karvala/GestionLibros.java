package net.Karvala;

import java.util.List;
import java.util.Scanner;

class GestionLibros {

    private List<Libro> biblioteca;
    //Creamos los objetos de busqieda, input y autput y put
    Busqueda busqueda  = new Busqueda(biblioteca);
    Input in = new Input();
    Output out = new Output();
    Put put = new Put();

    //constructor
    public GestionLibros(){}

    public GestionLibros(List<Libro> biblioteca){
       this.biblioteca = getBiblioteca();
        }

    //Buscar un libro segun la opcion
    public List<Libro> buscarLibro(){
        Opcion elegirBuscar = in.menu();
        busqueda.buscar(elegirBuscar);
        out.mensaje();
        return busqueda.listaBuscada;
    }

    //Métodos (Get / Get ON / Post / Delete)

    //Imprimir libro por pantalla (GET)
    public void getLibro(Libro libro) {
        System.out.println(libro);
    }

    //Imprimir todos los libros por pantalla (GET ON)

    public List<Libro> getBiblioteca() {
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
            return biblioteca;

    }

        //Introducir libros nuevos en la biblioteca (POST)
        public Libro postLibro () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nuevo libro");

            System.out.println("Título:");
            String titulo = sc.nextLine();

            System.out.println("Autoría:");
            String autoria = sc.nextLine();

            System.out.println("Estantería:");
            String estanteria = sc.nextLine();

            Libro l = new Libro(titulo, autoria, estanteria);
            biblioteca.add(l);

            System.out.println("Su libro con id " + l.getId() + " se ha añadido correctamente a la biblioteca");
            return l;
        }

        // Editar un atributo concreto del libro (PUT)
        public void putLibro () {
            Opcion elegirEditar = in.menuEditar();
            System.out.println(elegirEditar);
            put.put(elegirEditar);
        }

        // Eliminar un libro por id
        public void deleteLibro ( int id){
            biblioteca.removeIf(libro -> libro.getId() == id);
        }

}