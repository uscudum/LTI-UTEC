package Semana3.ClasesAbstractas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Probando el método abstracto
        String color="color";
        double lado,base,altura;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca lado del cuadrado :");
        lado=input.nextDouble();
        System.out.println("Introduzca la base del triángulo :");
        base=input.nextDouble();
        System.out.println("Introduzca altura del triángulo :");
        altura=input.nextDouble();
        Cuadrado c1 = new Cuadrado(color,lado);
        Triangulo t1 = new Triangulo("verde",base,altura);
        System.out.printf("Área cuadrado %s es: %.2f %n", c1.getColor(), c1.calcularArea());
        //System.out.println();
        System.out.printf("Área triángulo %s es: %.2f %n", t1.getColor(), t1.calcularArea());
    }
}

