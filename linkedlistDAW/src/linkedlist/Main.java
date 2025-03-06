package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        //O(n) -> Lento
        //O(1) -> Más rápido

        ArrayList<Persona> listaNumeros = new ArrayList<>();
        LinkedList<Persona> linkedNumeros = new LinkedList<>();

        long antes, despues;
        int indice;

        antes = System.nanoTime();
        for(int i = 0;i<100000;i++){
            listaNumeros.add(new Persona(i,"Persona",i));
        }

        despues = System.nanoTime() - antes; //ns

        System.out.println("Tiempo requerido ArrayList: "+despues);

        antes = System.nanoTime();
        for(int i = 0;i<100000;i++){
            linkedNumeros.add(new Persona(i,"Persona",i));
        }

        despues = System.nanoTime() - antes; //ns

        System.out.println("Tiempo requerido LinkedList: "+despues);

        antes = System.nanoTime();

        for(int i = 0;i<100;i++){
            indice = (int) (Math.random()* 10000);
            listaNumeros.get(indice);
        }

        despues = System.nanoTime() - antes;
        System.out.println("Tiempo requerido de acceso en ArrayList: "+despues);

        antes = System.nanoTime();

        for(int i = 0;i<100;i++){
            indice = (int) (Math.random()* 10000);
            linkedNumeros.get(indice);
        }

        despues = System.nanoTime() - antes;
        System.out.println("Tiempo requerido de acceso en Linkedlist: "+despues);


        antes = System.nanoTime();

        for(int i = 0;i<100;i++){
            listaNumeros.remove(0);
        }

        despues = System.nanoTime() - antes;

        System.out.println("Tiempo requerido para eliminar en ArrayList: "+despues);


        antes = System.nanoTime();

        for(int i = 0;i<100;i++){
            linkedNumeros.remove(0);
        }

        despues = System.nanoTime() - antes;

        System.out.println("Tiempo requerido para eliminar en Linkedlist: "+despues);

    }
}
