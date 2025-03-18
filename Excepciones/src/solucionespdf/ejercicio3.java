package solucionespdf;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ejercicio3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("archivo_inexistente");
        //IOException
    }
}
