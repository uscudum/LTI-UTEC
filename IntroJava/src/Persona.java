public class Persona {
    private String nombre;
    private int edad;
    private byte cantHijos;

    public Persona(String nombre, int edad, byte hijos){
        this.nombre = nombre;
        this.edad = edad;
        this.cantHijos = hijos;
    }

    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", cantidad de hijos=" + cantHijos + "]";
    }
}

