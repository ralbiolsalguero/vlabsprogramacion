package nivelFacil;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        int energia = 100;
        int posicion = 1;
        boolean juegoActivo = true;
        int opcion;
        int salaDestino = 0;
        int evento; // 0, 1, 2

        while (juegoActivo) {
            //Mostrar el estado actual
            System.out.println("Estas en la sala: " + posicion + " con " + energia + " puntos de energia");

            //Mostrar opciones
            System.out.println("Elige una opción");
            System.out.println("1. Moverse a otra sala");
            System.out.println("2. Inspeccionar la sala");
            System.out.println("3. Salir del juego");

            //Leer y validar la entrada del usuario (hasNextInt())
            if (scn.hasNextInt()) {
                opcion = scn.nextInt();
            } else {
                System.out.println("Por favor, ingrese un número valido");
                scn.next(); //Limpiar la entrada no válida
                opcion = 0;
            }
            if (opcion == 1 || opcion == 2 || opcion == 3) {
                switch (opcion) {
                    case 1:
                        //Mover a otra sala
                        System.out.println("Elige a que sala moverte: ");
                        if (posicion == 1) {
                            System.out.println("Sala 2");
                            System.out.println("Sala 3");
                        } else if (posicion == 2) {
                            System.out.println("Sala 1");
                            System.out.println("Sala 4");
                        } else if (posicion == 4) {
                            System.out.println("Sala 1");
                            System.out.println("Sala 2");
                        }
                        if (scn.hasNextInt()) {
                            salaDestino = scn.nextInt();
                            if ((posicion == 1 && (salaDestino == 2 || salaDestino == 3)) ||
                                    (posicion == 2 && (salaDestino == 1 || salaDestino == 4)) ||
                                    (posicion == 4) && (salaDestino == 1 || salaDestino == 2)) {
                                posicion = salaDestino;
                            } else {
                                System.out.println("Movimiento invalido");
                            }
                        } else {
                            System.out.println("Por favor, ingrese un número valido");
                            scn.next(); //Limpiar la entrada
                        }
                        break;

                    case 2:
                        //Inspeccionar la sala
                        evento = random.nextInt(3); // 0 , 1 , 2
                        if (evento == 0) {
                            System.out.println("¡Has encontrado monedas! Ganas 10 puntos de energía");
                            energia += 10;
                        } else if (evento == 1) {
                            System.out.println("¡Has caido en la trampa! Pierdes 15 puntos de energía");
                            energia -= 15;
                        } else {
                            System.out.println("No encuentras nada");
                        }
                        break;
                    case 3:
                        //Salir del juego
                        System.out.println("Has decidido salir del juego");
                        juegoActivo = false;
                        break;
                }

                if (posicion == 3) {
                    System.out.println("¡Felicidades! has llegado a la sala 3 y has ganado el juego");
                    juegoActivo = false;
                } else if (energia <= 0) {
                    System.out.println("Te has quedado sin energía. Has perdido el juego");
                    juegoActivo = false;
                }

            } else {
                System.out.println("Por favor selecciona una opción valida");
            }
        }

    }

}

