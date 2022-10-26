package net.Karvala;

import java.util.Scanner;

public class Busqueda {

    //Búsqueda
    static Libro busqueda = null;

    //clase enum con las diferentes opciones de los inputs



    public static Opcion menu() {

        try {
            System.out.println("Buscar un libro: ¿Por dónde quieres empezar?");
            System.out.println("1: Id");
            System.out.println("2: Título");
            System.out.println("3: Autoría");
            System.out.println("4: Estantería");
            //System.out.println("5: Terminar la búsqueda");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            Opcion opcion = Opcion.convert(input);
            System.out.println("La opcion escogida es: " + opcion);
            return opcion;
        } catch (NullPointerException e) {
            System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            menu();
            return Opcion.VACIO;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
            menu();
            return Opcion.VACIO;
        }
    }

    public static Libro buscar(Opcion opcion) {
        try {
            switch (opcion) {
                case ID:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Id del libro a buscar:");
                    int buscarId = sc1.nextInt();
                    sc1.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (buscarId == libro.getId()) {
                            busqueda = libro;
                        }
                    }
                    break;

                case TITULO:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Título del libro a buscar:");
                    String buscarTitulo = sc2.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (buscarTitulo.equals(libro.getTitlulo())) {
                            busqueda = libro;
                        }
                    }
                    break;

                case AUTORIA:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Autoría del libro a buscar:");
                    String buscarAutoria = sc3.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (buscarAutoria.equals(libro.getAutoria())) {
                            busqueda = libro;
                        }
                    }
                    break;

                case ESTANTERIA:
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Estantería del libro a buscar:");
                    String buscarEstanteria = sc4.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (buscarEstanteria.equals(libro.getEstanteria())) {
                            busqueda = libro;
                        }
                    }
                    break;

                default:
                    System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");

            System.out.println("El Libro que ha buscado es: " + Busqueda.busqueda);
        }
            return busqueda;
        } catch(NullPointerException e) {
            System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            menu();
            return busqueda;
        } catch(Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
            menu();
            return busqueda;
        }

    }

    public static void mensaje() {

        if (null != busqueda) {
            System.out.println("Libro encontrado.");
        } else {
            System.out.println("Libro no encontrado. Inténtalo de nuevo");
        }
    }




}
