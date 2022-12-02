package net.Karvala;

import java.util.Scanner;

public class Input {

    //Scanner para buscar un libro
    public Opcion menu() {
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
            return Opcion.VACIO;
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error. Vuelva a intentarlo.");
            return Opcion.VACIO;
        }
    }

    //Scanner para elegir la ID y posterioprmente editar ese libro
    public int elegirID() {
        Scanner scPut = new Scanner(System.in);
        System.out.println("Id del libro:");
        int put = scPut.nextInt();
        scPut.nextLine();
        return put;
    }

    public Opcion menuEditar() {
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

}