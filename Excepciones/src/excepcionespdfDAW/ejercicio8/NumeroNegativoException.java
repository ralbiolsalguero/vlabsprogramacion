package excepcionespdfDAW.ejercicio8;

public class NumeroNegativoException extends Exception{
    public NumeroNegativoException(){
        super("Número negativo no permitido");
    }
    public NumeroNegativoException(String mensaje){
        super(mensaje);
    }
}
