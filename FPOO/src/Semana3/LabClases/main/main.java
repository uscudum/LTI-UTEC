package Semana3.LabClases.main;

import Semana3.LabClases.clases.Mascota;
import Semana3.LabClases.clases.Persona;

public class main {
    public static void main(String[] args) {
        Persona p1 = new Persona("46429616", "Guille", "Uscudum");
        System.out.println(p1.toString());
        Mascota m1 = new Mascota("perro", "Steve", 7, p1);
        System.out.println(m1.toString());
        System.out.println("Su tipo de alimentación es: " + m1.alimentacion());

    }
}
