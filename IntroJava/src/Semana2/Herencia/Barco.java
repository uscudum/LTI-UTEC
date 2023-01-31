package Semana2.Herencia;

public class Barco {

    public int latitud;
    public int longitud;
    public double largo;
    public double ancho;

    public Barco(int latitud, int longitud, double largo, double ancho) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String toString() {
        return "Barco{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                ", largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}

