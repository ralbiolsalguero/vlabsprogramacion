package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_ARTICULOS = 5;
        final int NUM_SUCURSALES = 4;

        double[] precios = new double[NUM_ARTICULOS];
        int[][] cantidades = new int[NUM_SUCURSALES][NUM_ARTICULOS];
        double[] recaudacionSucursal = new double[NUM_SUCURSALES];
        double recaudacionTotal = 0;
        int sucursalMayorRecaudacion = 0;

        // Leer precios de los artículos
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            System.out.println("Ingrese el precio del artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        // Leer cantidades vendidas por sucursal
        for (int i = 0; i < NUM_SUCURSALES; i++) {
            System.out.println("Sucursal " + (i + 1) + ":");
            for (int j = 0; j < NUM_ARTICULOS; j++) {
                System.out.println("Ingrese la cantidad vendida del artículo " + (j + 1) + ": ");
                cantidades[i][j] = scanner.nextInt();
                // Calcular recaudación por sucursal
                recaudacionSucursal[i] += precios[j] * cantidades[i][j];
            }
            // Calcular la recaudación total de la empresa
            recaudacionTotal += recaudacionSucursal[i];
            // Determinar la sucursal de mayor recaudación
            if (recaudacionSucursal[i] > recaudacionSucursal[sucursalMayorRecaudacion]) {
                sucursalMayorRecaudacion = i;
            }
        }

        // Informar resultados
        System.out.println("\nResultados:");
        // Cantidades totales de cada artículo
        for (int i = 0; i < NUM_ARTICULOS; i++) {
            int cantidadTotalArticulo = 0;
            for (int j = 0; j < NUM_SUCURSALES; j++) {
                cantidadTotalArticulo += cantidades[j][i];
            }
            System.out.println("Cantidad total del artículo " + (i + 1) + ": " + cantidadTotalArticulo);
        }

        // Cantidad de artículos en la sucursal 2
        int totalArticulosSucursal2 = 0;
        for (int cantidad : cantidades[1]) {
            totalArticulosSucursal2 += cantidad;
        }
        System.out.println("Total de artículos vendidos en la sucursal 2: " + totalArticulosSucursal2);

        // Cantidad del artículo 3 en la sucursal 1
        System.out.println("Cantidad del artículo 3 en la sucursal 1: " + cantidades[0][2]);

        // Recaudación total de cada sucursal
        for (int i = 0; i < NUM_SUCURSALES; i++) {
            System.out.println("Recaudación de la sucursal " + (i + 1) + ": " + recaudacionSucursal[i]);
        }

        // Recaudación total de la empresa
        System.out.println("Recaudación total de la empresa: " + recaudacionTotal);

        // Sucursal de mayor recaudación
        System.out.println("La sucursal de mayor recaudación es la sucursal " + (sucursalMayorRecaudacion + 1) + " con una recaudación de " + recaudacionSucursal[sucursalMayorRecaudacion]);
    }
}

