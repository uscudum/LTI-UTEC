package Semana3.Material;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Ejemplo de Interface

        Figura f1 = new Cuadrado(5);
        Figura f2 = new Rectangulo(4,7);
        Figura f3 = new Circulo(8);

        System.out.println("Área cuadrado ="+f1.area());
        System.out.println("Perímetro cuadrado ="+f1.perimetro());
        System.out.println("Área rectángulo ="+f2.area());
        System.out.println("Perímetro cuadrado ="+f2.perimetro());
        System.out.println("Área circunferencia ="+f3.area());
        System.out.println("Perímetro cuadrado ="+f3.perimetro());
    }
}
