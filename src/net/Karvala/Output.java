package net.Karvala;

public class Output extends Busqueda {

    public void mensaje() {

        if (listaBuscada.isEmpty()) {
            System.out.println("Libro no encontrado. Compruebe que lo ha escrito correctamente e inténtalo de nuevo.");
        } else {
            System.out.println("Libro encontrado.");
        }
    }



}
