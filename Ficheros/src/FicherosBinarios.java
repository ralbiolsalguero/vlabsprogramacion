import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicherosBinarios {
    public static void main(String[] args) {
        /*Ficheros Binarios*/
        //Todo fichero que no sea de texto, .word, .jpg, etc

        File f = new File("ficherobin.bin");
        //FileOutputStream: Escribir -> System.out.println()
        //FileInputStream: Leer -> System.in

        try {

            FileOutputStream fos = new FileOutputStream(f);
            String texto = "Utilizando ficheros binarios";
            byte [] codigo = texto.getBytes();
            fos.write(codigo);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
