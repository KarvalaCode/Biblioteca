package net.Karvala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GestionLibros {

    static ArrayList<Libro> biblioteca = new ArrayList<>();

    //Buscar un libro segun la opcion
    public static List<Libro> buscarLibro(){
        Opcion elegirBuscar = Busqueda.menu();
        Busqueda.buscar(elegirBuscar);
        Busqueda.mensaje();
        return Busqueda.buscarVarios;
    }

    //Métodos (Get / Get ON / Post / Delete)

    //Imprimir libro por pantalla (GET)
    public void getLibro(Libro libro) {
        System.out.println(libro);
    }

    //Imprimir todos los libros por pantalla (GET ON)
    public static void getBiblioteca() {
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }

    //Introducir libros nuevos en la biblioteca (POST)
    public static Libro postLibro() {
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
    public static void putLibro(){
        Opcion elegirEditar = Put.menuEditar();
        System.out.println(elegirEditar);
        Put.put(elegirEditar);
    }

    // Eliminar un libro por id
    public static void deleteLibro(int id) {
        biblioteca.removeIf(libro -> libro.getId() == id);
    }

}