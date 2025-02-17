package factorialRecursivo;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        //Guarda el resultado en una variable
        int resultado = factorialRecursivo(n);

        //Muestra el resultado
        System.out.println(resultado);

    }

    public static int factorialRecursivo(int numero) {

        int resultado;

        if (numero == 1) {
            //Se termina la recursión
            resultado = 1;
        } else {
            //Se llama asi misma la funcion, con el valor del numero menos 1
            resultado = numero * factorialRecursivo(numero - 1);
        }

        //Devolvemos el valor
        return resultado;

    }
}
