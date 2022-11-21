package net.Karvala;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //Creamos una biblioteca en formato lista de objetos Libro.
        List<Libro> biblio = new ArrayList<>();

        //Creamos varios libros y los añadimos a la biblioteca para probar todos los métodos. En la app final los libros deberan añadirse mediante el método post.
        Libro l1 = new Libro("Titulo del Libro", "Autores del libro", "Salón");
        Libro l2 = new Libro("Titulo", "Autores", "Habitación");
        Libro l3 = new Libro("Hola", "Yo", "Habitación2");
        Libro l4 = new Libro("Mi vida", "Sara", "Habitación");

        biblio.add(l1);
        biblio.add(l2);
        biblio.add(l3);
        biblio.add(l4);

        System.out.println(biblio);

        //Creamos un objeto BIBLIOTECA, que es una gestor de libros.
        GestionLibros gestorLibros = new GestionLibros(biblio);
        System.out.println(buscarLibroPorId(gestorLibros));

        gestorLibros.post(Post.postLibro);
        //gestorLibros.buscarLibro();

        //gestorLibros.deleteLibro(3);

        //gestorLibros.putLibro();

        //gestorLibros.getBiblioteca();



    }

    private static String buscarLibroPorId(GestionLibros gestorLibros) {
        return gestorLibros.get(1).map(libro -> "El libro encontrado es " + libro.getTitlulo())
                .orElse("Libro no encontrado");
    }

}
