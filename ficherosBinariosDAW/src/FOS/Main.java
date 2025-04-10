package FOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
        * Ficheros texto -> Texto
        * Ficheros binarios -> .dat, .bin, .jpg, .ods
        * */

        /*System.out.println() -> FileOutputStream*/
        /*System.in -> FileInputStream*/

        File f = new File("fichero.bin");

        try {
            FileOutputStream fos = new FileOutputStream(f);
            String texto = "Utilizando ficheros binarios";
            byte [] codigo = texto.getBytes(); //ASCII
            fos.write(codigo);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
