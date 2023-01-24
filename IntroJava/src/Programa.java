import java.util.LinkedList;

public class Programa {
    public static void main(String[] args) {

        LinkedList<String> listaStrings = new LinkedList<String>();

        //Agregar elementos a la lista

        listaStrings.add("Hola");
        listaStrings.add("chau");
        listaStrings.add("otro texto");


        for (String s : listaStrings){
            System.out.println(s);
        }

        for (int i = 0; i < listaStrings.size(); i++){
            System.out.println(listaStrings.get(i));
        }

    }
}


