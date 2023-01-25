package Relaciones;

public class Principal {
    public static void main(String[] args) {
        // --------- Ejemplo donde relacionamos un auto y una persona

        //Creamos una instancia de un auto
        Auto auto1 = new Auto("Chevrolet", "Aveo G3", "AAA1158", 2014, null);

        //Ahora creamos instancia de persona que se relaciona con el auto1
        Persona persona1 = new Persona("Guillermo", "1.123.456-7", true, auto1);

        auto1.propietario = persona1;
    }
}

