package net.Karvala;

public class Main extends Libro{

    public static void main(String[] args) {

        Libro l1 = new Libro("Titulo del Libro", "Autores del libro", 1982, "Editorial", "Salón");
        Libro l2 = new Libro("Titulo", "Autores", 1995, "Editorial", "Habitación");
        biblioteca.add(l1);
        biblioteca.add(l2);

        //Añadir libro a la biblioteca (POST)
        Libro l3 = postLibro();
        biblioteca.add(l3);
        System.out.println(biblioteca);

        //Imprimir libro por pantalla (GET)
        getLibro(l1);

        //Modificar libro (PUT)
        l1.putLibro("Titulo del Libro", "Autoras del libro", 1982, "Editorial", "Salón");
        System.out.println(biblioteca);

        //Eliminar libro (DELETE)
        deleteLibro(l1);
        System.out.println(biblioteca);



    }
}
