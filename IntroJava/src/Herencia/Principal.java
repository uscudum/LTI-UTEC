package Herencia;

public class Principal {

    public static void main (String[] args) {

        // ----- Instanciamos un Barco

        Barco barco1 = new Barco(10, 15, 450, 58);

        double largobarco1 = barco1.largo;

        // ----- Intanciamos un BarcoGuerra

        BarcoGuerra barcoGuerra1 = new BarcoGuerra(10, 15, 87.2, 152.36, 10);

        // obtenemos un atributo heredado
        double anchoBarcoGuerra = barcoGuerra1.ancho;

        // obtenemos un atributo propio
        int cañones = barcoGuerra1.cantidadCañones;

        System.out.println(barco1);
        System.out.println(barcoGuerra1);
    }
}


