package Semana2.EstructuraDeDatos;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> listaStrings = new LinkedList<String>();

        //Agregar elementos a la lista

        listaStrings.add("Hola");
        listaStrings.add("chau");
        listaStrings.add("otro texto");

        //consulta de tamaño

        int tamanio = listaStrings.size(); //¿Cuál es el resultado esperado?

        //consulta por vacío

        boolean esVacia = listaStrings.isEmpty();

        //contiene elemento

        boolean contains1 = listaStrings.contains("este texto");
        boolean contains2 = listaStrings.contains("hola");

        //devolver el elemento en la posición 3 de la lista

        String string = listaStrings.get(3);

    }
}
