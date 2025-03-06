package ejercicioPractico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Aplicación de gestión de tareas

        /*
        * Medir en tiempos:
        * 1. Insercción de 100.000 elementos
        * 2. Eliminación de 100 elementos
        * 3. Acceso aleatorio de 100 elementos
        * Ordenar de la A-Z tareas, y ordenar de la Z-A las tareas
        * */

        ArrayList<String> tareasArrayList = new ArrayList<>();
        LinkedList<String> tareasLinkedList = new LinkedList<>();
        Scanner scn = new Scanner(System.in);
        int opcion, indice;
        String tarea;

        do {
            System.out.println("MENU DE OPCIONES DE TAREAS");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas (ArrayList)");
            System.out.println("4. Mostrar tareas (LinkedList)");
            System.out.println("5. Salir");
            System.out.println("Seleccionar una opcion");
            opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la tarea");
                    tarea = scn.next();
                    tareasArrayList.add(tarea);
                    tareasLinkedList.add(tarea);
                    System.out.println("Tarea agregada");
                    break;
                case 2:
                    System.out.println("Ingrese el número de la tarea a eliminar (1 en adelelnate");
                    indice = scn.nextInt();
                    if (indice > 0 && indice <= tareasArrayList.size()) {
                        tareasArrayList.remove(indice - 1);
                        tareasLinkedList.remove(indice - 1);
                        System.out.println("Tarea eliminada");
                    } else {
                        System.out.println("Número invalido");
                    }
                    break;
                case 3:
                    System.out.println("Lista de tareas ArrayList: " + tareasArrayList);
                    break;
                case 4:
                    System.out.println("Lista de tareas Linkedlist: " + tareasLinkedList);
                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Ninguna de esas opciones es correcta");

            }


        } while (opcion != 5);


    }
}
