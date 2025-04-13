package fichero;

import java.io.*;
import java.util.Scanner;

public class Main {

    static final String NOMBRE_FICHERO = "listin.txt";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Crear el fichero con el listín si no existe
            crearFichero();

            int opcion;
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Consultar un libro");
                System.out.println("2. Introduzca nuevo titulo del libro");
                System.out.println("3. Eliminar un libro");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        buscarLibro();
                        break;
                    case 2:
                        agregarLibro();
                        break;
                    case 3:
                        eliminarLibro();
                        break;
                    case 4:
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
                }
            } while (opcion != 4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void crearFichero() throws IOException {
        // Si el fichero no existe, lo crea

        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_FICHERO))) {
            // No hace falta hacer nada si el fichero ya existe
        } catch (IOException e) {
            // El fichero no existe, así que lo crea
            BufferedWriter writer = null;
            try {
                writer = new BufferedWriter(new FileWriter(NOMBRE_FICHERO));
                System.out.println("Fichero " + NOMBRE_FICHERO + " creado.");
            } finally {
                if (writer != null) {
                    writer.close();
                }

            }
        }
    }

    static void buscarLibro() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el titulo del libro ");
        String tituloLibro = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_FICHERO))) {
            String linea;
            boolean encontrado = false;
            while (!encontrado && (linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3 && partes[0].equals(tituloLibro)) {
                    System.out.println("Libro: " + tituloLibro + ", Autor: " + partes[1]+", Anio: "+partes[2]);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Libro no encontrado en la lista.");
            }
        }
    }

    static void agregarLibro() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el titulo del libro: ");
        String tituloLibro = scanner.nextLine();

        System.out.print("Introduzca el autor del libro: ");
        String autorLibro = scanner.nextLine();

        System.out.print("Introduzca el año de publicacion ");
        String anioPublicacion = scanner.nextLine();

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(NOMBRE_FICHERO, true));
            writer.write(tituloLibro + "," + autorLibro+","+anioPublicacion);
            writer.newLine();
            System.out.println("Cliente agregado al listín.");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    static void eliminarLibro() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del libro a eliminar: ");
        String tituloLibro = scanner.nextLine();

        // Crear un nuevo archivo temporal para escribir el listín sin el cliente a eliminar
        String nombreFicheroTemporal = "temporal.txt";
        BufferedWriter writer = null;
        BufferedReader reader = null;
        boolean encontrado;
        try {
            reader = new BufferedReader(new FileReader(NOMBRE_FICHERO));
            writer = new BufferedWriter(new FileWriter(nombreFicheroTemporal));
            String linea;
            encontrado = false;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3 && partes[0].equals(tituloLibro)) {
                    encontrado = true;
                } else {
                    writer.write(linea);
                    writer.newLine();
                }
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
            if (reader != null) {
                reader.close();
            }

        }
        if (encontrado) {
            System.out.println("Libro eliminado de la lista.");
        } else {
            System.out.println("Libro no eliminado de la lista.");
        }
        // Reemplazar el fichero original con el temporal
        if (encontrado) {
            if (eliminarFichero(NOMBRE_FICHERO) && renombrarFichero(nombreFicheroTemporal, NOMBRE_FICHERO)) {
                System.out.println("Listín actualizado.");
            } else {
                System.out.println("Error al actualizar el listín.");
            }
        }


    }

    static boolean eliminarFichero(String nombreFichero) {
        return new java.io.File(nombreFichero).delete();
    }

    static boolean renombrarFichero(String nombreFicheroAntiguo, String nombreFicheroNuevo) {
        return new java.io.File(nombreFicheroAntiguo).renameTo(new java.io.File(nombreFicheroNuevo));
    }
}



