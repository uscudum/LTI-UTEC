package Asociacion;

public class Persona {

    private String nombre;
    private String ci;
    private boolean mayorEdad;


    private Auto ultimoAutoVendido;
    private Auto autoActual;


    private Producto[] productos;


    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Persona(String nombre, String ci, boolean mayorEdad, Auto auto) {
        this.nombre = nombre;
        this.ci = ci;
        this.mayorEdad = mayorEdad;
        this.ultimoAutoVendido = auto;
    }

    public Persona(String nombre, String ci, boolean mayorEdad, Auto ultimoAuto,Auto autoActual) {
        this.nombre = nombre;
        this.ci = ci;
        this.mayorEdad = mayorEdad;
        this.ultimoAutoVendido = ultimoAuto;
        this.autoActual = autoActual;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getCi() {
        return ci;
    }



    public void setCi(String ci) {
        this.ci = ci;
    }



    public boolean isMayorEdad() {
        return mayorEdad;
    }



    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }



    public Auto getUltimoAutoVendido() {
        return ultimoAutoVendido;
    }



    public void setUltimoAutoVendido(Auto ultimoAutoVendido) {
        this.ultimoAutoVendido = ultimoAutoVendido;
    }



    public Auto getAutoActual() {
        return autoActual;
    }



    public void setAutoActual(Auto autoActual) {
        this.autoActual = autoActual;
    }


}
