package ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CD cd = new CD();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú de opciones para la CD:");
            System.out.println("1. Llenar CD");
            System.out.println("2. Agregar Canción");
            System.out.println("3. Servir Taza");
            System.out.println("4. Vaciar CD");
            System.out.println("5. Mostrar Información de la CD");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 2:

                    System.out.print("Ingrese el título de la canción: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el artista de la canción: ");
                    String artista = scanner.nextLine();
                    Cancion cancion = new Cancion(titulo, artista);
                    cd.agrega(cancion);
                    System.out.println("Canción agregada a la CD.");
                    break;

                case 4:
                    cd.elimina(1);
                    System.out.println("La CD ha sido vaciada.");
                    break;
                case 5:
                    System.out.println("Información de la CD:");
                    System.out.println(cd);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);


    }
}
