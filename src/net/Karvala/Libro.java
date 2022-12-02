package net.Karvala;

public class Libro {

    //Atributos
    private int id;
    private String titulo;
    private String autoria;
    private String estanteria;

    private static int contId = 0;

    //Constructores (vacío y con atributos)
    public Libro() {}

    public Libro(String titulo, String autoria, String estanteria) {
        this.id = contId++;
        this.titulo = titulo;
        this.autoria = autoria;
        this.estanteria = estanteria;

    }

    //Getters
    public int getId(){return id;}
    public String getTitlulo(){return titulo;}
    public String getAutoria(){return autoria;}
    public String getEstanteria() {return estanteria;}

    //Setters
    public void setId (int id){this.id = id;}
    public void setTitlulo (String titulo) {this.titulo = titulo;}
    public void setAutoria (String autoria) {this.autoria = autoria;}
    public void setEstanteria (String estanteria) {this.estanteria = estanteria;}

    //Método toString para imprimir los atributos por pantalla
    @Override
    public String toString() {
        return "GestionLibros{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autoria='" + autoria + '\'' +
                ", estanteria='" + estanteria + '\'' +
                '}';
    }

}
