package net.Karvala;

public enum Opcion {
        VACIO(0),
        ID(1),
        TITULO(2),
        AUTORIA(3),
        ESTANTERIA(4);

        public final int valor;

        Opcion(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }

        public static Opcion convert(int n) {
            for (Opcion o : values())
                if (o.getValor() == n)
                    return o;
            return null;
        }

}
