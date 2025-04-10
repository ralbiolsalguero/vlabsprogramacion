import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerBinarios {

    public static void main(String[] args) {
        File f = new File("prometeofp_logo.jpg");
        int valor;

        try {
            FileInputStream fis = new FileInputStream(f);
            valor = fis.read();
            while(valor != -1){
                System.out.print((char) valor);
                valor = fis.read();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
