package Semana3.Material;

public class Circulo implements Figura{
    private double radio;

    public Circulo (double radio){
        this.radio=radio;
    }

    public double area(){
        return 2*PI*this.radio;
    }
}
