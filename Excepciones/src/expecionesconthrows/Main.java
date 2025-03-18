package expecionesconthrows;

public class Main {
    public static void main(String[] args) {

        try {

            lanzarError();

        } catch (MiException e) {
            System.out.println("Excepción personalizada capturada: " + e.getMessage());
        }


    }

    static void lanzarError() throws MiException {
        throw new MiException("Esto es un error personalizado");
    }

}
