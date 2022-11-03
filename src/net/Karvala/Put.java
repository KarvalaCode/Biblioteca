package net.Karvala;

import java.util.List;
import java.util.Scanner;

public class Put extends GestionLibros{

    //Creamos un objeto gestor y una lista para guardar los resultados de la edición
    GestionLibros gestorBuscar = new GestionLibros();
    List<Libro> biblioPut = gestorBuscar.getBiblioteca();

    //Objeto INput
    Input in = new Input();

    //constructor
    public Put(){
    }

    public void put(Opcion opcion) {
        int put = in.elegirID();
        try {
            switch (opcion) {
                case ID:
                    System.out.println("Introduce nueva id: ");
                    Scanner sc1 = new Scanner(System.in);
                    int nuevaId = sc1.nextInt();
                    sc1.nextLine();

                    for (Libro libro : biblioPut) {
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

                    for (Libro libro : biblioPut) {
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

                    for (Libro libro : biblioPut) {
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

                    for (Libro libro : biblioPut) {
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
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
        }
    }
}
