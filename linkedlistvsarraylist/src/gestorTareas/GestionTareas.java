package gestorTareas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class GestionTareas {


    //Collections.sort A-Z
    //Collections.reverse Z-A

    public static void main(String[] args) {


        ArrayList<String> tareaArrayList = new ArrayList<>(); //es rapido de acceder a elementos
        LinkedList<String> tareasLinkedList = new LinkedList<>(); //Es mas eficinete para insertar y eliminar elementos
        Scanner scn = new Scanner(System.in);
        int opcion, indice;
        String tarea;


        do {
            System.out.println("Menú de gestión de tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Mostrar tareas (ArrayList)");
            System.out.println("4. Mostrar tareas (LinkedList)");
            System.out.println("5. Ordenar tareas por nombre A-Z");
            System.out.println("6. Ordenar tareas por nombre Z-A");
            System.out.println("7. Salir");
            System.out.println("Introduzca una opción");
            opcion = scn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la tarea");
                    tarea = scn.next();
                    tareaArrayList.add(tarea);
                    tareasLinkedList.add(tarea);
                    System.out.println("Tarea agregada");
                    break;
                case 2:
                    System.out.println("Ingrese el número de tarea a eliminar (1 adelante");
                    indice = scn.nextInt();

                    if (indice > 0 && indice <= tareaArrayList.size()) {
                        tareaArrayList.remove(indice - 1);
                        tareasLinkedList.remove(indice - 1);
                        System.out.println("Tarea eliminada");
                    } else {
                        System.out.println("Número de tarea inválido");
                    }
                    break;
                case 3:
                    System.out.println("Lista de tareas (ArrayList)" + tareaArrayList);
                    break;
                case 4:
                    System.out.println("Lista de tareas (LinkedList)" + tareasLinkedList);
                    break;

                case 5:
                    Collections.sort(tareaArrayList);
                    System.out.println(tareaArrayList);
                    break;
                case 6:
                    Collections.reverse(tareaArrayList);
                    System.out.println(tareaArrayList);
                    break;
                case 7:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Ninguna de estas opciones existen");
            }
        } while (opcion != 7);


    }

}
