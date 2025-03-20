package solucionespdfDAM.ejercicio8pdf;

public class NumeroNegativoException extends Exception{
    public NumeroNegativoException(){
        super("Numero negativo no permitido");
    }
    public NumeroNegativoException(String mensaje){
        super(mensaje);
    }
}
