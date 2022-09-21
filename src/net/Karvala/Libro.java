package net.Karvala;

import java.util.ArrayList;
import java.util.Scanner;

public class Libro {

    //Atributos
    String titulo;
    String autoria;
    int publicacion;
    String editorial;
    String estanteria;

    //Constructores (vacío y con todos los atributos)
    public Libro() {
    }

    public Libro(String titulo, String autoria, int publicacion, String editorial, String estanteria) {
        this.titulo = titulo;
        this.autoria = autoria;
        this.publicacion = publicacion;
        this.editorial = editorial;
        this.estanteria = estanteria;
    }


    //Método toString para imprimir los atributos por pantalla
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autoria='" + autoria + '\'' +
                ", publicacion=" + publicacion +
                ", editorial='" + editorial + '\'' +
                ", estanteria='" + estanteria + '\'' +
                '}';
    }

    static ArrayList<Libro> biblioteca = new ArrayList<>();

    //Métodos (Get / Post / Put / Delete)
    public static void getLibro (Libro libro){
        System.out.println(libro);
    }

    public static Libro postLibro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nuevo libro");

        System.out.println("Título:");
        String titulo = sc.nextLine();

        System.out.println("Autoría:");
        String autoria = sc.nextLine();

        System.out.println("Año de publicación:");
        int publicacion = sc.nextInt();
        sc.nextLine();

        System.out.println("Editorial:");
        String editorial = sc.nextLine();

        System.out.println("Estantería:");
        String estanteria = sc.nextLine();

        return new Libro(titulo, autoria, publicacion, editorial, estanteria);
    }

    public void putLibro(String titulo, String autoria, int publicacion, String editorial, String estanteria){
        this.titulo = titulo;
        this.autoria = autoria;
        this.publicacion = publicacion;
        this.editorial = editorial;
        this.estanteria = estanteria;
    }

    public static void deleteLibro(Libro libro) {
        biblioteca.remove(libro);
    }



}

