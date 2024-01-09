package net.Karvala.Biblioteca.repositories;

import net.Karvala.Biblioteca.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {

}
