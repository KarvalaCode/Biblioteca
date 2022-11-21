package net.Karvala;

import java.util.List;
import java.util.Scanner;

public class Post {
    private List<Libro> biblioPost;

    //constructor
    public Post(List<Libro> biblioPost){
        this.biblioPost = biblioPost;
    }
    }
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

        System.out.println("Su libro con id " + l.getId() + " se ha añadido correctamente a la biblioteca");
        return l;
    }
}
