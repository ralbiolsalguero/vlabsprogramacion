package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cantidad, edad;
        String nombre, apellido, genero;
        Scanner scn = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();

        System.out.println("Introduzca la cantidad de personas que quiero tener en mi ArrayList");
        cantidad = scn.nextInt(); //1

        for(int i = 0;i<cantidad;i++){
            System.out.println("Introduzca el nombre");
            nombre = scn.next();

            System.out.println("Introduzca el apellido");
            apellido = scn.next();

            System.out.println("Introduzca el genero (M/F)");
            genero = scn.next().toUpperCase();

            System.out.println("Introduzca la edad");
            edad = scn.nextInt();


            listaPersonas.add(new Persona(nombre,apellido,genero,edad));



        }


    }
}
