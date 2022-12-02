package net.Karvala;

import java.util.Optional;

public interface GestionPublicaDeLibros {

    java.util.Optional<Libro> get(int id);
    Libro post(Libro libro);
    Libro put(int id, Libro libro);
    boolean delete(int id);

}
