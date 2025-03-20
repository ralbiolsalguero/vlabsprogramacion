package excepcionespdfDAW;

public class ejercicio6 {

    static char caracterEn(String texto, int indice) throws Exception {
        if(indice >= 0 && indice < texto.length()){
            return texto.charAt(indice);
        }else{
            throw new Exception("Indice fuera de rango");
        }
    }
}
