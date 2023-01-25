package Relaciones;

import java.util.LinkedList;

public class Persona {

    public String nombre;
    public String ci;
    public boolean mayorEdad;
    LinkedList<Auto> autos = new LinkedList<>();

    public Persona(String nombre, String ci, boolean mayorEdad, LinkedList<Auto> autos){
        this.nombre = nombre;
        this.ci = ci;
        this.mayorEdad = mayorEdad;
        this.autos = autos;
    }
}




