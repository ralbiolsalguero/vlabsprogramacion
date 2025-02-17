package ejercicio4;

public class Main {

    static int numeroAleatorio(int min,int max){ //min: 5, max: 10
        int num;
        num = (int) (Math.random()*((max+1) - min)+min);
        return num;
    }

    public static void main(String[] args) {


        /*Crea un método en el cual va a recibir dos parámetros:
        * - El mínimo
        * - El máximo
        *
        * El método me va a devolver un número aleatorio entre el mínimo y el
        * máximo. Ej: Min: 5,Max: 20 -> 15
        * */

        System.out.println(numeroAleatorio(5,10));

    }
}
