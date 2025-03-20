package excepciontrycatch;

public class Main {
    public static void main(String[] args) {
        //¿Qué es una excepción? -> Evento anómalo que puede ocurrir
        //durante la ejecución de un programa y que alteral el flujo
        //normal del mismo

        //Try***-catch**-finally(v)

        try { //El código en el cual voy a comprobar si hay excepción
            int num = 10 / 0;
        } catch (ArithmeticException e) { //En el catch entraré si salta la excepción que indico
            System.out.println("Excepción capturada: "+e);
            System.out.println("Mensaje de error: " + e.getMessage());
            System.out.println("Pila de ejecución: ");
            e.printStackTrace(); //Muestra el rastreo de la pila de ejecución
        }
        finally { //Parte del código que se ejecuta indpendientemente que haya excepción o no
            System.out.println("Adios");
        }

    }
}
