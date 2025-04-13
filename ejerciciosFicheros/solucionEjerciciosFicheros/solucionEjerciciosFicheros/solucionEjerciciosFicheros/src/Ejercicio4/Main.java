package Ejercicio4;

import java.io.*;
import java.util.Scanner;

public class Main {

    static final String NOMBRE_FICHERO = "listin.txt";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Crear el fichero con el listín si no existe
            crearFicheroListin();

            int opcion;
            do {
                System.out.println("\nMenú:");
                System.out.println("1. Consultar teléfono de un cliente");
                System.out.println("2. Añadir teléfono de un nuevo cliente");
                System.out.println("3. Eliminar teléfono de un cliente");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        consultarTelefono();
                        break;
                    case 2:
                        agregarCliente();
                        break;
                    case 3:
                        eliminarCliente();
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

    static void crearFicheroListin() throws IOException {
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

    static void consultarTelefono() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_FICHERO))) {
            String linea;
            boolean encontrado = false;
            while (!encontrado && (linea = reader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2 && partes[0].equals(nombreCliente)) {
                    System.out.println("Teléfono de " + nombreCliente + ": " + partes[1]);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Cliente no encontrado en el listín.");
            }
        }
    }

    static void agregarCliente() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del nuevo cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Introduce el teléfono del nuevo cliente: ");
        String telefonoCliente = scanner.nextLine();
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(NOMBRE_FICHERO, true));
            writer.write(nombreCliente + "," + telefonoCliente);
            writer.newLine();
            System.out.println("Cliente agregado al listín.");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    static void eliminarCliente() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del cliente a eliminar: ");
        String nombreCliente = scanner.nextLine();

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
                if (partes.length == 2 && partes[0].equals(nombreCliente)) {
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
            System.out.println("Cliente eliminado del listín.");
        } else {
            System.out.println("Cliente no encontrado en el listín.");
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



