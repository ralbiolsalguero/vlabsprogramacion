package ejercicio2;

import java.util.Scanner;

public class Main {
    static int sumaValores(int [] array){
        int suma = 0;
        for(int i = 0;i<array.length;i++){
            suma+= array[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        //Crea un método que reciba por parámetros un array y que muestre el resultado
        //de la suma de todos sus números
        Scanner scn = new Scanner(System.in);

        int [] num = new int[10];

        System.out.println("Introduzca 10 números");

        for(int i = 0;i<num.length;i++){
            System.out.print("Introduzca número "+(i+1)+": ");
            num[i] = scn.nextInt();
        }

        System.out.println(sumaValores(num));

    }
}
