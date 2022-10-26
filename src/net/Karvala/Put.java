package net.Karvala;

import java.util.Scanner;

public class Put {


    public static int elegirID() {
        Scanner scPut = new Scanner(System.in);
        System.out.println("Id del libro a editar:");
        int put = scPut.nextInt();
        scPut.nextLine();
        return put;
    }

    public static Opcion menuEditar() {
        try {
            System.out.println("¿Qué quieres editar?");
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
            menuEditar();
            return Opcion.VACIO;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
            menuEditar();
            return Opcion.VACIO;
        }
    }

    public static void put(Opcion opcion) {
        int put = elegirID();
        try {
            switch (opcion) {
                case ID:
                    System.out.println("Introduce nueva id: ");
                    Scanner sc1 = new Scanner(System.in);
                    int nuevaId = sc1.nextInt();
                    sc1.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (put == libro.getId()) {
                            libro.setId(nuevaId);
                            System.out.println(libro);
                        }
                    }
                    break;

                case TITULO:
                    System.out.println("Introduce nuevo título: ");
                    Scanner sc2 = new Scanner(System.in);
                    String nuevoTitulo = sc2.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (put == libro.getId()) {
                            libro.setTitlulo(nuevoTitulo);
                            System.out.println(libro);
                        }
                    }
                    break;

                case AUTORIA:
                    System.out.println("Introduce nueva auitoría: ");
                    Scanner sc3 = new Scanner(System.in);
                    String nuevaAutoria = sc3.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (put == libro.getId()) {
                            libro.setAutoria(nuevaAutoria);
                            System.out.println(libro);
                        }
                    }
                    break;

                case ESTANTERIA:
                    System.out.println("Introduce nueva estantería: ");
                    Scanner sc4 = new Scanner(System.in);
                    String nuevaEstanteria = sc4.nextLine();

                    for (Libro libro : GestionLibros.biblioteca) {
                        if (put == libro.getId()) {
                            libro.setEstanteria(nuevaEstanteria);
                            System.out.println(libro);
                        }
                    }
                    break;
                default:
                    System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");

                    System.out.println("Ha editado el li con la ID: " + put);
            }
        } catch (NullPointerException e) {
            System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            menuEditar();
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
            menuEditar();
        }
    }
}
