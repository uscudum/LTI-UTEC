package Semana3.Material;

public class Cuadrado implements Figura{
    private double lado;

    public Cuadrado(double lado){
        this.lado=lado;
    }
    public double area() {
        return lado * lado;
    }
}
