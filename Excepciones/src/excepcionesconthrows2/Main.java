package excepcionesconthrows2;

public class Main {
    public static void main(String[] args) {

        //Excepción Comprobada -> Son excepciones que el compilador Java obliga a manajear con try-catch o throws
        //IOException, FileNotFoundException
        //Excepción No Comprobada ->Son excepciones que el compilador NO ogliga a manejar
        //ArithmeticException,  ArrayIndexOutOfBoundsException, NullPointerException

        try {
            validar(20); //Llamamos al método validar() con 0 provocará la excepción
        } catch (CustomException e) {
            System.out.println("Error: "+e.getMessage()); //Capturar la exceción y mostrar el mensaje
        }finally {
            System.out.println("Fin del programa");
        }

    }

    static void validar(int num) throws CustomException{
        if(num<=0){
            throw new CustomException("El número debe ser mayor a 0");
        }
    }
}
