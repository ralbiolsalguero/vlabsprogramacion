package ejercicio3;

import java.util.Scanner;

public class Main {
    static double areaCirculo(double r){
        final float PI = 3.14f;
        double resultado;
        resultado = PI*r*r;
        return resultado;
    }

    static double volumenCilindro(double r, double h){
        double resultado;
        resultado = areaCirculo(r)*h;
        return resultado;
    }

    public static void main(String[] args) {
        /*
        * Escribir un método que calcule el área de un círculo y otra que calcule
        * el volumen de un cilindro usando el primer método
        * Área del circulo = pi*r*r
        * Volumen del cilindro = Ab*h
        * */

        Scanner scn = new Scanner(System.in);
        double r,h;

        System.out.println("Introduzca el valor del radio");
        r = scn.nextDouble();

        System.out.println("Introduzca la altura");
        h = scn.nextDouble();

        System.out.println("El area del circulo es: "+areaCirculo(r));
        System.out.println("El volumen del cilindro es: "+volumenCilindro(r,h));
    }
}
