package net.Karvala;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Busqueda {

    private List<Libro> biblioBuscar;

    public Busqueda(List<Libro> biblioBuscar){
        this.biblioBuscar = biblioBuscar;
    }

    public List<Libro> buscar(Opcion opcion) {
        try {
            switch (opcion) {
                case ID -> {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Id del libro a buscar:");
                    int buscarId = sc1.nextInt();
                    sc1.nextLine();
                    return biblioBuscar.stream().filter(libro -> buscarId == libro.getId()).collect(Collectors.toList());
                }
                case TITULO -> {
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Título del libro a buscar:");
                    String buscarTitulo = sc2.nextLine();
                    return biblioBuscar.stream().filter(libro -> buscarTitulo.equals(libro.getTitlulo())).collect(Collectors.toList());
                }
                case AUTORIA -> {
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Autoría del libro a buscar:");
                    String buscarAutoria = sc3.nextLine();
                    return biblioBuscar.stream().filter(libro -> buscarAutoria.equals(libro.getAutoria())).collect(Collectors.toList());
                }
                case ESTANTERIA -> {
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Estantería del libro a buscar:");
                    String buscarEstanteria = sc4.nextLine();
                    return biblioBuscar.stream().filter(libro -> buscarEstanteria.equals(libro.getEstanteria())).collect(Collectors.toList());
                }
                default -> {
                    System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
                    return Collections.emptyList();
                }
            }
        }catch (NullPointerException e){
            System.out.println("Número incorrecto. Debe introducir un número entre el 1 y el 4");
            return Collections.emptyList();
        } catch(Exception ex) {
            System.out.println("Ha ocurrido un error. Compruebe que lo ha escrito corerctamente. Vuelva a intentarlo.");
            return Collections.emptyList();
        }

    }





}
