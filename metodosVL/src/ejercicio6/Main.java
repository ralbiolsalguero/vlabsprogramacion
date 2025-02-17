package ejercicio6;

import java.util.Scanner;

public class Main {
    static int sumarFila(int[][] matriz, int fila) {
        int suma = 0;
        suma = 0;
        for (int i = 0; i < matriz[fila - 1].length; i++) {
            suma += matriz[fila][i];
        }

        return suma;
    }

    static int sumarColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna - 1];
        }
        return suma;
    }

    static int diagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];

        }
        return suma;
    }

    static int diagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz.length - 1; j >= 0; j--) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    static float mediaMatriz(int[][] matriz) {
        int suma = 0;
        float media;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
                cont++;
            }
        }
        media = (float) suma / cont;
        return media;
    }

    public static void main(String[] args) {
        /*
         * Se pide crear una matriz 4x4 de números enteros que inicialmente esta vacía,
         * nos piden hacer un menú de opciones
         * - 1. Crear una matriz, con números rellenados por el usuario (sin métodos)
         * - 2. Sumar una fila que se pedirá al usuario (controlar que se elija una correcta)
         * - 3. Sumar los números de una columna que se pedirá al usuario(controlar qeu se elija una correcta)
         * - 4. Sumar la diagonal principal
         * - 5. Sumar la diagonal inversa
         * - 6. La media de todos los valores de la matriz
         * */

        int[][] matriz = new int[4][4];
        Scanner scn = new Scanner(System.in);
        int opcion;
        int fila;
        int columna;

        System.out.println("Introduzca una de las siguientes opciones:");
        System.out.println("1. Crear una matriz, con números rellenados por el usuario");
        System.out.println("2. Sumar una fila que se pedirá al usuario (controlar que se elija una correcta)");
        System.out.println("3. Sumar los números de una columna que se pedirá al usuario(controlar que se elija una correcta)");
        System.out.println("4. Sumar la diagonal principal");
        System.out.println("5. Sumar la diagonal inversa");
        System.out.println("6. La media de todos los valores de la matriz");
        opcion = scn.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduzca los números en la matriz");
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.println("Introduzca el valor para [" + i + "][" + j + "]");
                        matriz[i][j] = scn.nextInt();
                    }
                }
                break;
            case 2:
                System.out.println("Introduza la fila");
                fila = scn.nextInt();
                System.out.println(sumarFila(matriz,fila));
                break;
            case 3:
                System.out.println("Introduza la columna");
                columna = scn.nextInt();
                System.out.println(sumarColumna(matriz,columna));
                break;
            case 4:
                System.out.println(diagonalPrincipal(matriz));
                break;
            case 5:
                System.out.println(diagonalInversa(matriz));
                break;
            case 6:
                System.out.println(mediaMatriz(matriz));
                break;
            default:
                System.out.println("No existe esa opción");
        }


    }
}
