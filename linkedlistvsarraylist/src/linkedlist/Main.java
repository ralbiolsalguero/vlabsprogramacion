package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //ArrayList -> Intefaz List

        List<Persona> listaArray = new ArrayList<>();
        //ArrayList<Persona> listaArray = new ArrayList<>();
        List<Persona> listalinked = new LinkedList<>();
        //LinkedList<Persona> listalinked = new LinkedList<>();
        long antes;
        for(int i = 0;i<10000;i++){
            listaArray.add(new Persona(i,"Pesrsona",i));
        }

        System.out.println("Tiempo invertido en insertar una persona en listaArray (nanosegundos)");
        antes = System.nanoTime();

        listaArray.add(0,new Persona(10001,"Pepe",10));

        System.out.println("Diferencia arraylist: "+(System.nanoTime() - antes));



        System.out.println(antes);

        for (int i = 0;i<10000;i++){
            listalinked.add(new Persona(i,"Persona",i));
        }

        System.out.println("Tiempo invertido en insertar una persona en linked (nanosegundos)");
        antes = System.nanoTime();

        listalinked.add(0,new Persona(10001,"Pepe",10));

        System.out.println("Diferencia linked: "+(System.nanoTime() - antes));



        System.out.println(antes);


    }
}
