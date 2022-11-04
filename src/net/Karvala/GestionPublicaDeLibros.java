package net.Karvala;

public interface GestionPublicaDeLibros {

    Libro get(int id);
    Libro post(Libro libro);
    Libro put(int id, Libro libro);
    boolean delete(int id);

}
