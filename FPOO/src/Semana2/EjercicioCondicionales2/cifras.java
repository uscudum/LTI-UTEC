package Semana2.EjercicioCondicionales2;

import java.util.Scanner;

public class cifras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor");
        int num = leer.nextInt();

        if (num < 10){
            System.out.println("1 cifra");
        } else if (num < 100) {
            System.out.println("2 cifras");
        } else if (num < 1000) {
            System.out.println("3 cifras");
        }


    }
}
