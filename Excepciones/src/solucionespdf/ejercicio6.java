package solucionespdf;

public class ejercicio6 {
    public static void main(String[] args) {

        try {
            caracter("Hola",10);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static char caracter(String cadena, int indice) throws Exception{
        if(indice>=0 && indice<cadena.length()){
            return cadena.charAt(indice);
        }else{
            throw new Exception("Indice fuera de rango");
        }
    }
}
