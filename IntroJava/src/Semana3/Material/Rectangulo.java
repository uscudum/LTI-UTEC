package Semana3.Material;

public class Rectangulo implements Figura, Perimetro{
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double area() {
        return this.alto * this.ancho;
    }

    public double perimetro() {
        return 2 * (this.alto + this.ancho);
    }
}
