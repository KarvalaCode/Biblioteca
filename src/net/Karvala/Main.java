package net.Karvala;

public class Main {

    public static void main(String[] args) {

        Libros l1 = new Libros("Titulo del Libro", "Autores del libro", "Salón");
        Libros l2 = new Libros("Titulo", "Autores", "Habitación");
        Libros l3 = new Libros("Hola", "Yo", "Habitación2");
        Libros l4 = new Libros("Mi vida", "Sara", "Habitación");

        GestionLibros.biblioteca.add(l1);
        GestionLibros.biblioteca.add(l2);
        GestionLibros.biblioteca.add(l3);
        GestionLibros.biblioteca.add(l4);

        //GestionLibros.postLibro();

        //GestionLibros.buscar();

        //GestionLibros.deleteLibro(3);

        //GestionLibros.putLibro();

        GestionLibros.getBiblioteca();

    }

}
