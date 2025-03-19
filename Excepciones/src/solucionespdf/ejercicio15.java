package solucionespdf;

public class ejercicio15 {
    public static void main(String[] args) {

        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }

    }

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1; //1
            valor = valor + Integer.parseInt("42"); //43
            valor = valor + 1; //44
            System.out.println("Valor al final del try : " + valor); //44
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch : " + valor);
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally : " + valor);
        }

        valor = valor + 1;
        System.out.println("Valor antes del return : " + valor);
        return valor;

    }
}
