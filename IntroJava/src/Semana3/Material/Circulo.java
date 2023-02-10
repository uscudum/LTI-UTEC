package Semana3.Material;

public class Circulo implements Figura, Perimetro{
    private double radio;

    public Circulo (double radio){
        this.radio=radio;
    }

    public double area(){
        return PI*this.radio*this.radio;
    }

    public double perimetro() {
        return 2*PI*this.radio;
    }
}
