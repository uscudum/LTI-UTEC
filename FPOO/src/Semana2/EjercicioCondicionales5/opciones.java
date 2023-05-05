package Semana2.EjercicioCondicionales5;

import java.util.Scanner;

public class opciones {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un mes");
        int mes = leer.nextInt();


        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
        }
    }
}
