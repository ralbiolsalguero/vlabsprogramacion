package excepcionesconthrows2;

public class CustomException extends Exception{
    public CustomException(String mensaje){
        super(mensaje);//getMessage();
    }
}
