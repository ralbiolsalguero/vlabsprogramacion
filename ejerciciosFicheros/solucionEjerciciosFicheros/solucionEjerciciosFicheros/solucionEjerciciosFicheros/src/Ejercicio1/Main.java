package Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero entre 1 y 10: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 10) {
            generarTablaMultiplicar(numero);
            System.out.println("Tabla de multiplicar generada y guardada en el archivo tabla-" + numero + ".txt");
        } else {
            System.out.println("El número ingresado no está en el rango válido.");
        }


    }

    public static void generarTablaMultiplicar(int numero) {
        String nombreArchivo = "tabla-" + numero + ".txt";
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(nombreArchivo));
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                String linea = numero + " x " + i + " = " + resultado;
                writer.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error E/S de datos");
            e.printStackTrace();
        }finally {
            if(writer!=null){
                writer.close();
            }

        }
    }

}
