package Semana3.LabClases.clases;

public class Persona {

    //Atributos de la clase
    private String ci;
    private String nombre;
    private String apellido;


    //Constructor
    public Persona(String ci, String nombre, String apellido){
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters and Setters
    public String getCi(){
        return ci;
    }

    public void setCi(String ci){
        this.ci = ci;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona [Nombre: " + nombre + "Apellido: " + apellido + "CI: " +ci+ " ]";
    }
}
