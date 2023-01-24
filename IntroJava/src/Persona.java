public class Persona {
    public String nombre;
    public int edad;
    public byte cantHijos;

    public Persona(String nombre, int edad, byte hijos){
        this.nombre = nombre;
        this.edad = edad;
        this.cantHijos = hijos;
    }

    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", cantidad de hijos=" + cantHijos + "]";
    }
}

