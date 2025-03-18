package excepcionesconArrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Pida al usuario ingresar el tamaño de un array
        * Pida al usuario ingresar los elementos de un array
        * Pida al usuario ingresar un indice para acceder a un elemento del array
        * Si el indice esta fuera de rango, lanzar una excepción personalizada (throws)
        * Manejar la exepción en el main, mostrando un mensaje de error
        * */

        Scanner scn = new Scanner(System.in);
        int tamanio, indice, valor;

        try{
            System.out.println("Intrese el tamaño del array");
            tamanio = scn.nextInt();

            int [] num = new int[tamanio];

            System.out.println("Ingrese los elementos del array");
            for (int i = 0;i<tamanio;i++){
                System.out.println("Elemento ["+i+"]: ");
                num[i] = scn.nextInt();
            }

            System.out.println("Ingrese el indice que desea consultar");
            indice = scn.nextInt();

            valor = obtenerElemento(num,indice);
            System.out.println("El valor en el indice "+indice+" es: "+valor);
        }catch (IndiceFueraDeRangoException e){
            System.out.println("Error: "+e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrión un error inesperado "+e.getMessage());
        }finally {
            System.out.println("Programa finalizado");
        }
    }

    static int obtenerElemento(int [] array, int indice) throws IndiceFueraDeRangoException{
        if(indice < 0 || indice >= array.length){
            throw new IndiceFueraDeRangoException("Indice: "+indice+" fuera de rango. Debe estar entre 0 y "+(array.length -1));
        }
        return array[indice];
    }
}
