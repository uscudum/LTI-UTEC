package Herencia;

public class BarcoCarga extends Barco {

    public int pesoPermitido;
    public int cantidadContainers;

    public BarcoCarga(int latitud, int longitud, double largo, double ancho, int pesoPermitido, int cantidadContainers){
        super(latitud, longitud, largo, ancho);
        this.pesoPermitido = pesoPermitido;
        this.cantidadContainers = cantidadContainers;
    }
}

