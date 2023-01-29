package Asociacion;

public class Principal {

    public static void main(String[] args) {


        // -------- Ejemplo donde relacionamos un auto y una persona

        Auto auto1 = new Auto("Chevrolet", "Aveo G3", "AAA1158", 2014);
        Auto auto2 = new Auto("Fiat", "pepe", "YYYY", 2015);


        Persona guille = new Persona("Guillermo", "1.123.456-7", true, auto1);
        Persona maria = new Persona("Maria", "we-7", true, auto2, auto1);


        Producto harina = new Producto("harina",35);
        Producto arroz = new Producto("arroz", 20);
        Producto detergente = new Producto("detergente", 51);

        Producto[] productosDeMaria = {harina,arroz,detergente};

        maria.setProductos(productosDeMaria);



    }

}
