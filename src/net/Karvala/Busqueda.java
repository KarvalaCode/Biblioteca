package net.Karvala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Busqueda {

    //Búsqueda
    static List<Libro>  busqueda = new ArrayList<>();

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
            return Opcion.VACIO;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
            return Opcion.VACIO;
        }
    }

    public static List<Libro> buscar(Opcion opcion) {
        try {
            switch (opcion) {
                case ID:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Id del libro a buscar:");
                    int buscarId = sc1.nextInt();
                    sc1.nextLine();

                    busqueda = GestionLibros.biblioteca.stream().filter(libro -> buscarId == libro.getId()).collect(Collectors.toList());
                    break;

                case TITULO:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Título del libro a buscar:");
                    String buscarTitulo = sc2.nextLine();

                    busqueda = GestionLibros.biblioteca.stream().filter(libro -> buscarTitulo.equals(libro.getTitlulo())).collect(Collectors.toList());
                    break;

                case AUTORIA:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Autoría del libro a buscar:");
                    String buscarAutoria = sc3.nextLine();

                    busqueda = GestionLibros.biblioteca.stream().filter(libro -> buscarAutoria.equals(libro.getAutoria())).collect(Collectors.toList());
                    break;

                case ESTANTERIA:
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Estantería del libro a buscar:");
                    String buscarEstanteria = sc4.nextLine();

                    busqueda = GestionLibros.biblioteca.stream().filter(libro -> buscarEstanteria.equals(libro.getEstanteria())).collect(Collectors.toList());
                    break;

                default:
                    System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            }
        }catch (NullPointerException e){
            System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            return busqueda;
        } catch(Exception ex) {
            System.out.println("Ha ocurrido un error. Compruebe que lo ha escrito correctamente. Vuelva a intentarlo.");
            return busqueda;
        }

        System.out.println("El Libro que ha buscado es: " + busqueda);
        return busqueda;
    }

    public static void mensaje() {

        if (busqueda.isEmpty()) {
            System.out.println("Libro no encontrado. Compruebe que lo ha escrito correctamente e inténtalo de nuevo.");
        } else {
            System.out.println("Libro encontrado.");
        }
    }




}
