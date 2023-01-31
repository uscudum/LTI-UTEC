package Semana2.Relaciones;

import Semana2.Relaciones.Auto;
import Semana2.Relaciones.Persona;

import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {

        Auto auto1 = new Auto("Chevrolet", "Aveo G3", "AAA1158", 2014, null);
        Auto auto2 = new Auto("Chevrolet", "JOY plus", "SSA2258", 2021, null);
        Auto auto3 = new Auto("Chevrolet", "JOY", "SSA2299", 2021, null);

        LinkedList<Auto> autosDeGuille = new LinkedList<>();
        autosDeGuille.add(auto1);
        autosDeGuille.add(auto2);
        autosDeGuille.add(auto3);

        // Ahora creamos la instancia de persona y le pasamos la lista de autos
        Persona persona1 = new Persona("Guillermo", "1.123.456-7", true, autosDeGuille);

        //Si además, en cada auto quiero identificar a su propietario, lo indico
        auto1.propietario = persona1;
        auto2.propietario = persona1;
        auto3.propietario = persona1;

        System.out.println(persona1);
    }
}




