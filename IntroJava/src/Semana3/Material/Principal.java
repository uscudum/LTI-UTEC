package Semana3.Material;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Ejemplo de Inteface

        Cuadrado c1 = new Cuadrado(5);
        Rectangulo c2 = new Rectangulo(4,7);
        Circulo c3 = new Circulo(8);

        System.out.println("Área cuadrado ="+c1.area());
        System.out.println("Perímetro cuadrado ="+c1.perimetro());
        System.out.println("Área rectángulo ="+c2.area());
        System.out.println("Perímetro rectángulo ="+c2.perimetro());
        System.out.println("Área circunferencia ="+c3.area());
        System.out.println("Perímetro circunferencia ="+c3.perimetro());
    }
}
