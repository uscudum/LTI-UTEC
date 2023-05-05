package Semana3.Otros;

import java.util.Scanner;
public class LaboratorioCondicionales {
    public static void main(String[] args) {

                // Laboratorio de Condicionales.

                // Scanner.
                Scanner scan = new Scanner(System.in);

                // Armamos MENU.
                System.out.println("-MENU-");
                System.out.println("----------------------------------");
                System.out.println("1. Ingresar 2 números enteros diferentes y visualizar el mayor de ellos.");
                System.out.println("2. Pedir un número entre 0 y 99999 y decir cuantas cifras tiene.");
                System.out.println("3. Simular Inicio de Sesión.");
                System.out.println("4. Determinar si un número es múltiplo de 10.");
                System.out.println("----------------------------------");
                System.out.println("Seleccione la opción deseada:");

                // Capturar la opción del usuario.
                int opcionSeleccionada = scan.nextInt();

                // Evaluo en switch sobre la variable de la opcionSeleccionada.
                switch (opcionSeleccionada) {

                    case 1:
                        System.out.println("Ingrese el número uno:");
                        int numUno = scan.nextInt();

                        System.out.println("Ingrese el número dos:");
                        int numDos = scan.nextInt();

                        if (numUno > numDos) {
                            System.out.println("El número uno es mayor.");
                        } else {
                            System.out.println("El número dos es mayor");
                        }
                        break;

                    case 2:
                        System.out.println("Ingrese un número entre 0 y 99999");
                        int numero = scan.nextInt();
                        if (numero < 10) {
                            System.out.println("El número ingresado tiene 1 cifra.");
                        } else if (numero < 100) {
                            System.out.println("El número ingresado tiene 2 cifras.");
                        } else if (numero < 1000) {
                            System.out.println("El número ingresado tiene 3 cifras.");
                        } else if (numero < 10000) {
                            System.out.println("El número ingresado tiene 4 cifras.");
                        } else {
                            System.out.println("El número ingresado tiene 5 cifras.");
                        }
                        break;

                    case 3:
                        System.out.println("Ingrese el nombre de usuario: ");
                        String nomUsr = scan.next();

                        System.out.println("Ingrese la contraseña de usuario: ");
                        String pwdUsr = scan.next();

                        if (nomUsr.equals("kevin") && pwdUsr.equals("12345")) {
                            System.out.println("Bienvenido al Sistema. " + nomUsr);
                        } else {
                            System.out.println("Datos incorrectos.");
                        }
                        break;

                    case 4:
                        System.out.println("Ingrese un número: ");
                        int numeroMultiplo = scan.nextInt();
                        if (numeroMultiplo % 10 == 0) {
                            System.out.println("El número es multiplo de 10.");
                        } else {
                            System.out.println("El número no es múltiplo de 10.");
                        }
                        break;

                    default:
                        System.out.println("Opción incorrecta!");
                        break;
                }



    }
}