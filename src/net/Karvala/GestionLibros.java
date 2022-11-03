package net.Karvala;

import java.util.List;
import java.util.Scanner;

class GestionLibros implements GestionPublicaDeLibros {

    private List<Libro> biblioteca;
    //Creamos los objetos de busqieda, input y autput y put
    private Busqueda busqueda;
    Input in = new Input();
    Output out = new Output();
    private Put put; //TODO probar  = new Put(biblioteca); y no instanciar en el constructor

    public GestionLibros(List<Libro> biblioteca){
       this.biblioteca = getBiblioteca();
       this.put = new Put(biblioteca);
       this.busqueda = new Busqueda(biblioteca);
        }

    //Buscar un libro segun la opcion
    public List<Libro> buscarLibro(){
        Opcion elegirBuscar = in.menu();
        List<Libro> listaBuscada = busqueda.buscar(elegirBuscar);
        System.out.println("El/los Libro/s que ha buscado es/son: " + listaBuscada);
        out.mensaje();
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
        public Libro postLibro (Libro newLibro) {
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
        public void putLibro (int id, Libro updatedLibro) {
            Opcion elegirEditar = in.menuEditar();
            System.out.println(elegirEditar);
            put.put(elegirEditar);
        }

        // Eliminar un libro por id
        public void deleteLibro ( int id){
            biblioteca.removeIf(libro -> libro.getId() == id);
        }

    @Override
    public Libro get(int id) {
        return null;
    }

    @Override
    public Libro post(Libro libro) {
        return null;
    }

    @Override
    public Libro put(int id, Libro libro) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}