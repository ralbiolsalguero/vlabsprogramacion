package cuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //POO -> Paradigma de la programación
        //Clase -> Lugar donde definamos las características y los comportamientos de mi objeto
        //Atributos -> Caracteristicas de mi objeto
        //Métodos -> Comportamientos de mi objeto

        //Objeto: Nombre de la clase + nombre del objeto = new nombre del constructor()
        Cuenta c1 = new Cuenta("Pepe","ES8476373",0.98,1000);
        Cuenta c2 = new Cuenta("Pepa","ES837363",0.1,1000);
        Scanner scn = new Scanner(System.in);

        System.out.println(c1.getNombreCliente());
        System.out.println(c2.getNombreCliente());
        System.out.println(c1);

        int n = 5;
        n = 10;

    }
}


