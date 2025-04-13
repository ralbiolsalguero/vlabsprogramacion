package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero entre 1 y 10 (n): ");
        int n = scanner.nextInt();
        System.out.print("Introduce el segundo número entero entre 1 y 10 (m): ");
        int m = scanner.nextInt();

        mostrarLineaTablaMultiplicar(n, m);

    }
    public static void mostrarLineaTablaMultiplicar(int n, int m) {
        String nombreArchivo = "tabla-" + n + ".txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
            System.out.println("Línea " + m + " de la tabla de multiplicar del " + n + ":");
            String linea = null;
            int contador = 0;
            while (contador < m && (linea = reader.readLine()) != null) {
                contador++;
            }
            if(contador == m){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo " + nombreArchivo + " no existe.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error E/S de datos");
            e.printStackTrace();
        }
    }

}
