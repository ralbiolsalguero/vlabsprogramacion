package excepcionespdfDAW;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String lect_teclado;
        char resultado;
        try {
            System.out.println("Introduzca la cadena de caracteres");
            lect_teclado = scn.nextLine();

            resultado = caracterEn(lect_teclado, 7);

            System.out.println("El caracter de la posición 7 es: " + resultado);

        } catch (Exception e) {
            System.out.println("Has intentado acceder a una posición fuera del rango de la cadena de caracteres");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin del programa");
        }

    }

    static char caracterEn(String texto, int indice) throws Exception {
        if (indice >= 0 && indice < texto.length()) {
            return texto.charAt(indice);
        } else {
            throw new Exception("Indice fuera de rango");
        }
    }
}
