package Semana3.Material;

public class Cuadrado implements Figura, Perimetro{
    private double lado;

    public Cuadrado(double lado){
        this.lado=lado;
    }
    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return this.lado * 4;
    }
}
