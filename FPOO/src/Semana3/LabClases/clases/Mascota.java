package Semana3.LabClases.clases;

public class Mascota {
    private String especie;
    private String nombre;
    private int peso;
    private Persona propietario;


    public Mascota(String especie, String nombre, int peso, Persona propietario) {
        this.especie = especie;
        this.nombre = nombre;
        this.peso = peso;
        this.propietario = propietario;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", propietario=" + propietario +
                '}';
    }

    public String alimentacion(){
        String tipo="desconocida";

        if (this.peso > 10){
            tipo = "a dieta";
        }else if (this.peso < 2){
            tipo = "suplementada";
        }else{
            tipo = "normal";
        }


        return tipo;
    }
}
