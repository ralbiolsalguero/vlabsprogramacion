package solucionespdfDAM;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String lect_teclado;
        char resultado;

        System.out.println("Introduzca una cadena de texto");
        lect_teclado = scn.nextLine();

        try {
            resultado = caracter(lect_teclado, 7);
            System.out.println("Caracter de la posición 7 "+resultado);

        } catch (Exception e) {
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }

    }

    public static char caracter(String cadena, int indice) throws Exception{
        if(indice>=0 && indice<cadena.length()){
            return cadena.charAt(indice);
        }else{
            throw new Exception("Indice fuera de rango");
        }
    }
}
