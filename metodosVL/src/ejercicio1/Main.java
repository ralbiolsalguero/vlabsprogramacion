package ejercicio1;

import java.util.Scanner;

public class Main {

    static double calcularIVA(double totalSinIva, int porcentaje){
        double total;
        total = totalSinIva + ((totalSinIva*porcentaje)/100);
        return total;
    }

    public static void main(String[] args) {
        //Escriba un metodo el cual tiene que calcular el total de una factura.
        //La función debe recibir %IVA, y la cantidad a aplicar.

        Scanner scn = new Scanner(System.in);
        double totalSinIva;
        int porcentaje;

        System.out.println("Introduzca el valor total sin IVA");
        totalSinIva = scn.nextDouble();

        System.out.println("Introduzca el valor del porcentaje");
        porcentaje = scn.nextInt();

        System.out.println(calcularIVA(totalSinIva,porcentaje));

    }
}
