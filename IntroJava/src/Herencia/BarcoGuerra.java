package Herencia;

public class BarcoGuerra extends Barco {

    public int cantidadCañones;

    public BarcoGuerra(int latitud, int longitud, double largo, double ancho, int cantidadCañones) {
        super(latitud, longitud, largo, ancho);
        this.cantidadCañones = cantidadCañones;
    }
}


