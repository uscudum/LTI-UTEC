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

        for (Persona p:personal){
            System.out.println(p);
        }
    }
}
