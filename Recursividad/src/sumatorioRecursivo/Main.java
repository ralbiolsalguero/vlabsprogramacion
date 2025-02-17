package sumatorioRecursivo;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        //guardamos el resultado en una variable
        int resultado = sumaRecursiva(n);
        //Mostramos el resultado
        System.out.println(resultado);

    }

    public static int sumaRecursiva(int numero) {

        int resultado;

        if (numero == 1) {
            //Se termina la recursion
            resultado = 1;
        } else {
            //Se llama a si misma la función con el parametro numero menos 1
            resultado = numero + sumaRecursiva(numero - 1);
        }

        //Devuelve el resultado
        return resultado;
    }
}
