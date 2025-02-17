package métodos;

import java.util.Scanner;

public class Main {
    static void holaMundo() {
        System.out.println("Hola mundo");
    }

    static void comprobarPar(int n){
        if(n % 2 == 0){
            System.out.println("El número es un número par");
        }else{
            System.out.println("Es un número impar");
        }
    }
    static String holaMundoR(){
        return "Hola mundo";
    }

    static boolean comprobarParR(int n){
        boolean par = false; //par = false
        if(n % 2 == 0){
            par = true; //par = true
        }
        return par; //true
    }

    static String comprobarNumero(int n){
        String texto = "";
        if(n % 2 == 0){
            texto = "El número es par";
        }else{
            texto = "El número es impar";
        }
        return texto;
    }

    public static void main(String[] args) {
        //Métodos / Función (void)-> Bloque de código que solo se ejecuta cuando es llamado
        /*
         * 1. Métodos sin parámetros y sin return (void)
         * 2. Métodos con parámetros y sin return (void)
         * 3. Métodos sin parámetros y con return (String)
         * 4. Métodos con paramétros y con return
         * */
        //1º No se puede crear un método dentro de otro método
        //2º PARÁMETRO != VARIABLE
        //3º En un método = hay un return
        holaMundo();
        comprobarPar(11);
        Scanner scn = new Scanner(System.in);

        System.out.println(holaMundoR());

        //2º forma
        if(comprobarParR(5)){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }



    }


}
