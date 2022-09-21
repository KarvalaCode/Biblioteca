package net.Karvala;

import java.util.ArrayList;

public class Libro {

    //Atributos
    String titulo;
    String autoria;
    int publicacion;
    String editorial;
    boolean prestado;
    boolean leido;
    String estanteria;

    //Constructores (vacío / atributos mínimos / todos)
    public Libro() {
    }

    public Libro(String titulo, String autoria, String estanteria) {
        this.titulo = titulo;
        this.autoria = autoria;
        this.estanteria = estanteria;
    }

    public Libro(String titulo, String autoria, int publicacion, String editorial, boolean prestado, boolean leido, String estanteria) {
        this.titulo = titulo;
        this.autoria = autoria;
        this.publicacion = publicacion;
        this.editorial = editorial;
        this.prestado = prestado;
        this.leido = leido;
        this.estanteria = estanteria;
    }

    ArrayList<Libro> biblioteca = new ArrayList<>();

    //Método toString para imprimir los atributos por pantalla
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autoria='" + autoria + '\'' +
                ", publicacion=" + publicacion +
                ", editorial='" + editorial + '\'' +
                ", prestado=" + prestado +
                ", leido=" + leido +
                ", estanteria='" + estanteria + '\'' +
                '}';
    }
}
