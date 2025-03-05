package gestorTareasTiempo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        /*
         * MODIFICAR EL CÓDIGO PARA MEDIR TIEMPOS DE EJECUCIÓN
         * 1. Insercción de 100.000 elementos
         * 2. Eliminación de 100 elementos al inicio.
         * 3. Acceso aleatorio a 100 elementos
         * Consejos: utilizad constnates, utilizar System.nanoTime(), Math.random()
         * */

        long inicio, fin;

        final int ELEMENTOS = 100000;
        final int ACCESOS = 100;
        final int ELIMINACIONES = 100;
        int indice;

        ArrayList<Integer> tareaArrayList = new ArrayList<>(); //es rapido de acceder a elementos
        LinkedList<Integer> tareasLinkedList = new LinkedList<>(); //Es mas eficinete para insertar y eliminar elementos

        //Medir tiempo de insercción

        inicio = System.nanoTime();
        for (int i = 0; i < ELEMENTOS; i++) {
            tareaArrayList.add(i);
        }
        fin = System.nanoTime();
        System.out.println("Tiempo de insercción en ArrayList: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        for (int i = 0; i < ELEMENTOS; i++) {
            tareasLinkedList.add(i);
        }
        fin = System.nanoTime();
        System.out.println("Tiempo de insercción en LinkedList: " + (fin - inicio) + " ns");

        //Medir tiempo de eliminación de 100 elementos al inicio

        inicio = System.nanoTime();
        for (int i = 0; i < ELIMINACIONES; i++) {
            tareaArrayList.remove(0); //1,2,3,4,5
        }
        fin = System.nanoTime();
        System.out.println("Tiempo de elminación (inicio) en ArrayList: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();
        for (int i = 0; i < ELIMINACIONES; i++) {
            tareasLinkedList.remove(0); //1,2,3,4,5
        }
        fin = System.nanoTime();
        System.out.println("Tiempo de elminación (inicio) en LinkedList: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();

        for (int i = 0; i < ACCESOS; i++) {
            indice = (int) (Math.random() * (ELEMENTOS - ELIMINACIONES));
            tareaArrayList.get(indice);
        }
        fin = System.nanoTime();
        System.out.println("Tiempo de acceso aleatorio en ArrayList es: " + (fin - inicio) + " ns");

        inicio = System.nanoTime();

        for (int i = 0; i < ACCESOS; i++) {
            indice = (int) (Math.random() * (ELEMENTOS - ELIMINACIONES));
            tareasLinkedList.get(indice);
        }
        fin = System.nanoTime();
        System.out.println("Tiempo de acceso aleatorio en Linkedlist es: " + (fin - inicio) + " ns");

    }
}
