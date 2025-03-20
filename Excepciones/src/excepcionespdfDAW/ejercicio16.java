package excepcionespdfDAW;

public class ejercicio16 {
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
            valor = valor + 1; //valor = 1
            valor = valor + Integer.parseInt("W");  //1
            valor = valor + 1;
            System.out.println("Valor al final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42"); //43
            System.out.println("Valor al final del catch : " + valor); //43
        } finally {
            valor = valor + 1;  //44
            System.out.println("Valor al final de finally : " + valor); //44
        }

        valor = valor + 1; //45
        System.out.println("Valor antes del return : " + valor); //45
        return valor; //45

    }
}
