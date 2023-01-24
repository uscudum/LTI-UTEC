package Relaciones;

public class Principal {
    public static void main(String[] args) {
        // --------- Ejemplo donde relacionamos un auto y una persona

        //Creamos una instancia de un auto
        Auto auto1 = new Auto("Chevrolet", "Aveo G3", "AAA1158", 2014);

        //Ahora creamos instancia de persona que se relaciona con el auto1
        Persona persona1 = new Persona("Guillermo", "1.123.456-7", true, auto1);

        //Obtenemos el auto relacionado con la persona
        Auto autoDePersona1 = persona1.auto;

        // ---------- Ejemplo donde tenemos una persona que no tiene auto relacionado
        Persona persona2 = new Persona("Martín", "4.232.879-9", false, null);
        Auto autoPersona2 = persona2.auto;

        //¿qué valor tiene autoPersona2?

        if (autoPersona2 == null){
            System.out.println("Persona2 no tiene auto!");
        } else {
            System.out.println("Persona2 tiene auto!!");
        }


    }
}
