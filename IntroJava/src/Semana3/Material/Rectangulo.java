package Semana3.Material;

public class Rectangulo implements Figura{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area() {
        return this.alto * this.ancho;
    }
}
