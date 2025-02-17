package nivelDificil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        int energia = 100;
        int posicion = 1;
        boolean juegoActivo = true;
        int salaDestino;
        int evento;

        //Array de energia de las salas, valores aleatorios entre -20 y +20

        int[] energiaSalas = new int[4]; //0,0,0,0
        for (int i = 0; i < energiaSalas.length; i++) {
            energiaSalas[i] = random.nextInt(41) - 20; //Genera valores entre - 20 y +20
        }

        while (juegoActivo) {
            //Mostrar el estado actual
            System.out.println("Estas en la sala " + posicion + " con " + energia + " puntos de enegía");

            //Mostrar las opciones
            System.out.println("Elige una opción");
            System.out.println("1. Moverse a otra sala");
            System.out.println("2. Inspeccionar la sala");
            System.out.println("3. Inspeccionar todas las salas");
            System.out.println("4. Salir del juego");

            //Leer y validar la entrada del usuario
            int opcion;
            if (scn.hasNextInt()) {
                opcion = scn.nextInt();
            } else {
                System.out.println("Por favor, ingresa un número válido");
                scn.next(); //Limpiar la entrada no válida
                opcion = 0; //Asignar un valor invalido para no procesar
            }

            if (opcion >= 1 && opcion <= 4) {
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
                                energia += energiaSalas[salaDestino - 1];//[-10,5,-5,20]
                                System.out.println("Has entrado a la sala " + salaDestino + ". Tu energía ahora es " + energia + " puntos");
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
                        //Inspeccionar todas las salas
                        System.out.println("Energia de las salas");
                        for (int i = 0; i < energiaSalas.length; i++) {
                            System.out.println("Sala: " + (i + 1) + " : " + energiaSalas[i] + " puntos");
                        }
                        break;
                    case 4:
                        //Salir del juego
                        System.out.println("Has decidido salir del juego");
                        juegoActivo = false;
                        break;
                }
                //Comprobar condiciones de victoria o derrota
                if (posicion == 3 && energia >= 30) {
                    System.out.println("¡Felicidades! Has llegado a las Sala 3 con suficiente energia y has ganado el juego");
                    juegoActivo = false;
                } else if (energia <= 0) {
                    System.out.println("Te has quedado sin energía. Has perdido el juego");
                    juegoActivo = false;
                }

            } else {
                System.out.println("Por favor, selecciona una opción valida");
            }


        }


    }
}
