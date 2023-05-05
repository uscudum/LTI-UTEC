package Semana2.VideoConferencia;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);





        System.out.println("Ingrese una opción:");
        int opc = leer.nextInt();


        switch (opc){

            case 1:
                System.out.println("Entró en la opción 1");
                break;
            case 2:
                System.out.println("Entró en la opción 2");
                break;

            default:
                System.out.println("Opción no válida");
                break;


        }



    }
}
