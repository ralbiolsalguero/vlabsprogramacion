package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *
         * 1. Crear un ArrayList para almacenar nombres de estudiantes
         * 2. Agregue al menos cinco nombres al ArrayList
         * 3. Muestre todos los nombres almacenados en la lista.
         * 4. Permita al usuario buscar un nombre en la lista si esta presente o no. .contains ->true/false
         * 5. Permita al usuario eliminar un nombre de la lista si lo desea.
         * 6. Ordene la lista alfabéticamente y muestrela ordenada. Collection.sort A-Z 0-N
         * Collections.reverse Z-A, N-0
         * */
        Scanner scn = new Scanner(System.in);
        String estudiante, eliminado;
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Carlos");
        listaNombres.add("Adela");
        listaNombres.add("Miguel");
        listaNombres.add("Sofia");
        listaNombres.add("Sandra");

        System.out.println("Lista de estudiantes");
        for(String i:listaNombres){
            System.out.println(i);
        }

        System.out.println("Introduzca un estudiantes, para comprobar si esta en la lista");
        estudiante = scn.next();

        if(listaNombres.contains(estudiante)){//true
            System.out.println(estudiante+" se encuentra en mi lista de estudiantes");
        }else{
            System.out.println(estudiante+" no se encuentra en mi lista de estudiantes");
        }

        System.out.println("Introduzca un estudiantes, que quieras eliminar de la lista");
        eliminado = scn.next();

        if (listaNombres.remove(eliminado)){
            System.out.println(eliminado +" ha sido eliminado de mi lista de estudiantes");
        }else{
            System.out.println(eliminado+" no se encontraba en mi lista de estudiantes");
        }

        Collections.sort(listaNombres);

        for(String i:listaNombres){
            System.out.println(i);
        }



    }
}
