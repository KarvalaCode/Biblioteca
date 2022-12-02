package net.Karvala;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Put {

    //Creamos un objeto gestor y una lista para guardar los resultados de la edición
    private List<Libro> biblioPut;

    //Objeto INput
    Input in = new Input();

    //constructor
    public Put(List<Libro> biblioPut) {
        this.biblioPut = biblioPut;
    }

    public Libro putLibro(int id, Opcion opcion) {
        try {
            switch (opcion) {
                case ID -> {
                    System.out.println("Introduce nueva id: ");
                    Scanner sc1 = new Scanner(System.in);
                    int nuevaId = sc1.nextInt();
                    sc1.nextLine();
                    Libro libro = new Libro();
                    for (Libro l : biblioPut) {
                        libro = l;
                        if (id == libro.getId()) {
                            libro.setId(nuevaId);
                            System.out.println(libro);
                        }
                    }
                    return libro;
//                  biblioPut.stream().filter(libro -> id == libro.getId()).forEach(libro ->libro.setId(nuevaId));
                }

                case TITULO -> {
                    System.out.println("Introduce nuevo título: ");
                    Scanner sc2 = new Scanner(System.in);
                    String nuevoTitulo = sc2.nextLine();
                    Libro libro = new Libro();
                    for (Libro l : biblioPut) {
                        libro = l;
                        if (id == libro.getId()) {
                            libro.setTitlulo(nuevoTitulo);
                            System.out.println(libro);
                        }
                     }
                    return libro;
//                  biblioPut.stream().filter(libro -> id == libro.getId()).forEach(libro ->libro.setTitlulo(nuevoTitulo));
                }
                case AUTORIA -> {
                    System.out.println("Introduce nueva autoría: ");
                    Scanner sc3 = new Scanner(System.in);
                    String nuevaAutoria = sc3.nextLine();
                    Libro libro = new Libro();
                    for (Libro l : biblioPut) {
                        libro = l;
                        if (id == libro.getId()) {
                            libro.setAutoria(nuevaAutoria);
                            System.out.println(libro);
                        }
                    }
                    return libro;
//                  biblioPut.stream().filter(libro -> id == libro.getId()).forEach(libro ->libro.setAutoria(nuevaAutoria));
                }
                case ESTANTERIA -> {
                    System.out.println("Introduce nueva estantería: ");
                    Scanner sc4 = new Scanner(System.in);
                    String nuevaEstanteria = sc4.nextLine();
                    Libro libro = new Libro();
                    for (Libro l : biblioPut) {
                        libro = l;
                        if (id == libro.getId()) {
                            libro.setEstanteria(nuevaEstanteria);
                            System.out.println(libro);
                        }
                    }
                    return libro;
//                  biblioPut.stream().filter(libro -> id == libro.getId()).forEach(libro ->libro.setEstanteria(nuevaEstanteria));

                }
                default -> {
                    System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
                    System.out.println("Ha editado el libro con la ID: " + id);
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
        }
        return null;
    }
}
