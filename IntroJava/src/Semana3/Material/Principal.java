package Semana3.Material;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Ejemplo de Inteface

        Figura f1 = new Cuadrado(5);
        Figura f2 = new Rectangulo(4,7);
        Figura f3 = new Circulo(8);

        ArrayList<Figura> lista = new ArrayList<>();

        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        String dato;
        for (Figura f:lista){
            System.out.println(f.area());

            //Utilizamos el operador ternario en lugar del if
            dato=f instanceof Cuadrado ? "Cuadrado":f instanceof Rectangulo ? "Rectangulo": "Circulo";

            System.out.println(dato);
        }
    }
}
