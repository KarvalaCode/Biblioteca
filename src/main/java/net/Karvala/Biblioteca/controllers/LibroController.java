package net.Karvala.Biblioteca.controllers;

import io.swagger.annotations.ApiOperation;
import net.Karvala.Biblioteca.entities.Libro;
import net.Karvala.Biblioteca.repositories.LibroRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibroController {

    private final Logger log = LoggerFactory.getLogger(LibroController.class);

    //Atributo repository para añadirlo a esta clase desde el constructor
    private LibroRepository repositorio;

    //Constructor

    //inyección de dependencia
    public LibroController(LibroRepository repositorio) {
        this.repositorio = repositorio;
    }

    //CRUD sobre Libro

    //Buscar biblioteca (GET ON)
    /**
     * http://localhost:8080/api/libros
     */
    @GetMapping("/api/libros")
    public List<Libro> findAll(){
        return repositorio.findAll();
    }

    //Buscar libro por id (GET)

    //ResponseEntity sirve para configurar las respuestas de las peticiones HTTP
    @GetMapping("/api/libros/{id}")
    @ApiOperation("Busca un libro por su clase primaria (Long id)")
    public ResponseEntity<Libro> findById(@PathVariable Long id) {
        Optional<Libro> libroOptional = repositorio.findById(id);
//      El if se puede sustitur por la expresión funcional:
//      libroOptional.map(ResponseEntity::ok).orElse(() -> ResponseEntity.notFound().build());
        if (libroOptional.isPresent()) {
            return ResponseEntity.ok(libroOptional.get());
        } else {
            //el build() construye un ResponseEntity
            return ResponseEntity.notFound().build();
        }
    }
//        libroOptional.orElse(null);
//        Es una expresion funcional equivalente a :
//        if (libroOptional.isPresent()){
//            return libroOptional.get();
//        }else {return null;}


    //Crear Libro (POST)
    @PostMapping("/api/libros")
    public ResponseEntity<Libro> post(@RequestBody Libro libro){ //@RequestHeader HttpHeaders headers) {
        // System.out.println(headers.get("User-Agent)"));
        //RequestBody extrae la info del cuerpo de la petición y la carga en un parámetro de tipo libro
        if(libro.getId()!=null){ //id existe, no es POST)
            //los log se mandan a un archivo donde se guardarían todos los errores: crear log de org.slf4j.Logger private final
            log.warn("El libro ya existe");
            return ResponseEntity.badRequest().build();
        }
        Libro resultado = repositorio.save(libro);
        return ResponseEntity.ok(resultado);
    }

    //Actualizar libro (PUT)
    @PutMapping("api/libros")
    public ResponseEntity<Libro> put (@RequestBody Libro libro){
        if (libro.getId() == null) {
            log.warn("El libro no existe");
            return ResponseEntity.badRequest().build();
        }
        if (!repositorio.existsById(libro.getId()))  {
            log.warn("El libro no existe");
            return ResponseEntity.notFound().build();

        }
        Libro resultado = repositorio.save(libro);
        return ResponseEntity.ok(resultado);
}

    //Eliminar libro por id (DELETE)
    @DeleteMapping("api/libros/{id}")
    public ResponseEntity<Libro> delete(@PathVariable Long id){
        if(!repositorio.existsById(id)){
            log.warn("El libro no existe");
            return ResponseEntity.notFound().build();
        }
        repositorio.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //Eliminar todos los libros (DELETE ALL)
    @DeleteMapping("api/libros")
    public ResponseEntity<Libro> deleteAll(){
        log.info("REST Request para eliminar todos los libros");
        repositorio.deleteAll();
        return ResponseEntity.noContent().build();
    }


}
