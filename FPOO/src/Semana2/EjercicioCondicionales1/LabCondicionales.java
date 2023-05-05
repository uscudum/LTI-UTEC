package Semana2.EjercicioCondicionales1;

import java.sql.SQLOutput;
import java.util.Scanner;


public class LabCondicionales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer valor");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor");
        int num2 = leer.nextInt();
        if (num1 > num2) {
            System.out.println("El " + num1 + " es el mayor");
        } else {
            System.out.println("El " + num2 + " es el mayor");
        }


    }
}
