package net.Karvala;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Busqueda {

    GestionLibros gestorBuscar = new GestionLibros();

    //Constructores
    public Busqueda(){}

    public Busqueda(List<Libro> biblioBuscar){
        this.biblioBuscar = biblioBuscar;
    }

    //Creamos una lista para guardar los resusltados de la busqueda
    List<Libro> biblioBuscar= gestorBuscar.getBiblioteca();

    //Búsqueda
    List<Libro> listaBuscada = new ArrayList<>();


    public List<Libro> buscar(Opcion opcion) {
        try {
            switch (opcion) {
                case ID:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Id del libro a buscar:");
                    int buscarId = sc1.nextInt();
                    sc1.nextLine();

                    listaBuscada = biblioBuscar.stream().filter(libro -> buscarId == libro.getId()).collect(Collectors.toList());
                    break;

                case TITULO:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Título del libro a buscar:");
                    String buscarTitulo = sc2.nextLine();

                    listaBuscada = biblioBuscar.stream().filter(libro -> buscarTitulo.equals(libro.getTitlulo())).collect(Collectors.toList());
                    break;

                case AUTORIA:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Autoría del libro a buscar:");
                    String buscarAutoria = sc3.nextLine();

                    listaBuscada = biblioBuscar.stream().filter(libro -> buscarAutoria.equals(libro.getAutoria())).collect(Collectors.toList());
                    break;

                case ESTANTERIA:
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Estantería del libro a buscar:");
                    String buscarEstanteria = sc4.nextLine();

                    listaBuscada = biblioBuscar.stream().filter(libro -> buscarEstanteria.equals(libro.getEstanteria())).collect(Collectors.toList());
                    break;

                default:
                    System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            }
        }catch (NullPointerException e){
            System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            return listaBuscada;
        } catch(Exception ex) {
            System.out.println("Ha ocurrido un error. Compruebe que lo ha escrito corerctamente. Vuelva a intentarlo.");
            return listaBuscada;
        }

        System.out.println("El Libro que ha buscado es: " + listaBuscada);
        return listaBuscada;
    }





}
