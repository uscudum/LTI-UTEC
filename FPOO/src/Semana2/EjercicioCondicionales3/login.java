package Semana2.EjercicioCondicionales3;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese su nombre de usuario");
        String user = leer.nextLine();

        System.out.println("Ingrese su contraseña");
        String pass = leer.nextLine();

        if (user.equals("admin") && pass.equals("1234")){
            System.out.println("Acceso correcto");
        }






    }
}
