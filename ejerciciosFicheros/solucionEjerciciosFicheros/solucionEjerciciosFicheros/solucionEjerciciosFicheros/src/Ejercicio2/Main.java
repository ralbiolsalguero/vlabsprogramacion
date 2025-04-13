package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero entre 1 y 10: ");
        int numero = scanner.nextInt();

        mostrarTablaMultiplicar(numero);
    }

    public static void mostrarTablaMultiplicar(int numero) {
        String nombreArchivo = "tabla-" + numero + ".txt";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(nombreArchivo));
            System.out.println("Tabla de multiplicar del " + numero + ":");
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe.");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(reader!=null){
                    reader.close();
                }

            } catch (IOException e) {
                System.err.println("Error E/S de datos");
                e.printStackTrace();
            }
        }

    }

}
