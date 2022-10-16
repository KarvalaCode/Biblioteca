package net.Karvala;

import java.util.ArrayList;
import java.util.Scanner;

class GestionLibros {

    static ArrayList<Libros> biblioteca = new ArrayList<>();

    //Métodos (Get / Post / Put / Delete)

    //Imprimir libro por pantalla (GET)
    public void getLibro(Libros libro) {
        System.out.println(libro);
    }

    //Imprimir todos los libros por pantalla (GET ON)
    public static void getBiblioteca(ArrayList<Libros> biblioteca) {
        for (Libros libro : biblioteca) {
            System.out.println(libro);
        }
    }

    //Introducir libros nuevos en la biblioteca (POST)
    public static Libros postLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nuevo libro");

        System.out.println("Título:");
        String titulo = sc.nextLine();

        System.out.println("Autoría:");
        String autoria = sc.nextLine();

        System.out.println("Estantería:");
        String estanteria = sc.nextLine();

        Libros l = new Libros(titulo, autoria, estanteria);
        biblioteca.add(l);

        System.out.println("Su libro con id " + l.getId() + " se ha añadido correctamente a la biblioteca");
        return l;
    }

    //Búsqueda
    public static void buscar() {

        Libros busqueda = null;

        System.out.println("Buscar un libro: ¿Por dónde quieres empezar?");
        System.out.println("1: Id");
        System.out.println("2: Título");
        System.out.println("3: Autoría");
        System.out.println("4: Estantería");
        //System.out.println("5: Terminar la búsqueda");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Id del libro a buscar:");
                int buscar1 = sc1.nextInt();
                sc1.nextLine();

                for (Libros libro : biblioteca) {
                    if (buscar1 == libro.getId()) {
                        busqueda = libro;
                        System.out.println(libro);
                    }
                }
                break;

            case 2:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Título del libro a buscar:");
                String buscar2 = sc2.nextLine();

                for (Libros libro : biblioteca) {
                    if (buscar2.equals(libro.getTitlulo())) {
                        busqueda = libro;
                        System.out.println(libro);
                    }
                }
                break;

            case 3:
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Autoría del libro a buscar:");
                String buscar3 = sc3.nextLine();

                for (Libros libro : biblioteca) {
                    if (buscar3.equals(libro.getAutoria())) {
                        busqueda = libro;
                        System.out.println(libro);
                    }
                }
                break;

            case 4:
                Scanner sc4 = new Scanner(System.in);
                System.out.println("Estantería del libro a buscar:");
                String buscar4 = sc4.nextLine();

                for (Libros libro : biblioteca) {
                    if (buscar4.equals(libro.getEstanteria())) {
                        busqueda = libro;
                        System.out.println(libro);
                    }
                }
                break;

            default:
                System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
        }



        if (null != busqueda) {
            System.out.println("Libro encontrado.");
        } else {
            System.out.println("Libro no encontrado. Inténtalo de nuevo");
            buscar();
        }
    }
    // Editar un atributo copncreto del libro (PUT)
    public static void putLibro() {
        Scanner scPut = new Scanner(System.in);
        System.out.println("Id del libro a editar:");
        int put = scPut.nextInt();
        scPut.nextLine();

        System.out.println("¿Qué quieres editar?");
        System.out.println("1: Id");
        System.out.println("2: Título");
        System.out.println("3: Autoría");
        System.out.println("4: Estantería");
        //System.out.println("5: Terminar la búsqueda");
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce nueva id: ");
                Scanner sc1 = new Scanner(System.in);
                int nuevaId = sc1.nextInt();
                sc1.nextLine();

                for (Libros libro : biblioteca) {
                    if (put == libro.getId()) {
                        libro.setId(nuevaId);
                        System.out.println(libro);
                    }
                }
                break;

            case 2:
                System.out.println("Introduce nuevo título: ");
                Scanner sc2 = new Scanner(System.in);
                String nuevoTitulo = sc2.nextLine();

                for (Libros libro : biblioteca) {
                    if (put == libro.getId()) {
                        libro.setTitlulo(nuevoTitulo);
                        System.out.println(libro);
                    }
                }
                break;

            case 3:
                System.out.println("Introduce nueva auitoría: ");
                Scanner sc3 = new Scanner(System.in);
                String nuevaAutoria = sc3.nextLine();

                for (Libros libro : biblioteca) {
                    if (put == libro.getId()) {
                        libro.setAutoria(nuevaAutoria);
                        System.out.println(libro);
                    }
                }
                break;

            case 4:
                System.out.println("Introduce nueva estantería: ");
                Scanner sc4 = new Scanner(System.in);
                String nuevaEstanteria = sc4.nextLine();

                for (Libros libro : biblioteca) {
                    if (put == libro.getId()) {
                        libro.setEstanteria(nuevaEstanteria);
                        System.out.println(libro);
                    }
                }
                break;
        }
    }

    // Eliminar un libro por id
    public static void deleteLibro(int id) {
        biblioteca.removeIf(libro -> libro.getId() == id);
    }



}