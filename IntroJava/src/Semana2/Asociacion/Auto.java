package Semana2.Asociacion;

public class Auto {

    private String marca;
    private String modelo;
    private String matricula;
    private int año;

    public Auto(String marca, String modelo, String matricula, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }



}
