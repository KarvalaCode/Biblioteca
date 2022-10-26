package net.Karvala;

public class Main {

    public static void main(String[] args) {

        Libro l1 = new Libro("Titulo del Libro", "Autores del libro", "Salón");
        Libro l2 = new Libro("Titulo", "Autores", "Habitación");
        Libro l3 = new Libro("Hola", "Yo", "Habitación2");
        Libro l4 = new Libro("Mi vida", "Sara", "Habitación");

        GestionLibros.biblioteca.add(l1);
        GestionLibros.biblioteca.add(l2);
        GestionLibros.biblioteca.add(l3);
        GestionLibros.biblioteca.add(l4);

        //GestionLibros.postLibro();

        //GestionLibros.buscar();

        //GestionLibros.deleteLibro(3);

        GestionLibros.putLibro();

        //GestionLibros.getBiblioteca();

        //GestionLibros.buscarLibro();


    }

}
