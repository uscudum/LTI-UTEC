import java.util.LinkedList;

public class Principal {

    public static void main (String[] args){

        Persona p1 = new Persona("Tito", 40, (byte)2);
        Persona p2 = new Persona("Bety", 30, (byte)0);
        Persona p3 = new Persona("Pablo", 75, (byte)3);
        Persona p4 = new Persona("Maria", 15, (byte)0);
        Persona p5 = new Persona("Claudia", 23, (byte)1);

        LinkedList<Persona> personal = new LinkedList<Persona>();
        personal.add(p1);
        personal.add(p2);
        personal.add(p3);
        personal.add(p4);
        personal.add(p5);

        //informar si hay alguna persona que no tiene hijos en la lista
        //usamos un for que nos permita cortar la iteración, porque no sería necesario recorrer toda la lista
        //alcanza que se encuentre una persona que no tenga hijos para responder la pregunta

//        boolean encontre = false; //definimos una variable que oficie de bandera
//        for (int i =0; i < personal.size() && !encontre; i++){
//            if (personal.get(i).cantHijos==0){
//                encontre=true;
//                System.out.println(personal.get(i)); //esta impresión es solo para verificar cuántas veces ingresa al if
//            }
//        }

        boolean encontre = false; //definimos una variable que oficie de bandera
        int i=0;
        while (i < personal.size() && !encontre) {
            if (personal.get(i).cantHijos==0) {
                encontre = true;
                System.out.println(personal.get(i)); //esta impresión es sólo para verificar cuántas veces ingresa al if
            }
            i++;
        }
    }
}
