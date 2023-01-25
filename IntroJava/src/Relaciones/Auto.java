package Relaciones;

public class Auto {

    public String marca;
    public String modelo;
    public String matricula;
    public int anio;
    public Persona propietario;

    public Auto(String marca, String modelo, String matricula, int anio, Persona propietario){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
        this.propietario = propietario;
    }
}

