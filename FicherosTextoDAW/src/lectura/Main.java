package lectura;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*
        * LECTURA
        *
        * 1ª opcion: 1 linea -> FileReader -> read() ASCII 5135132135-1
        *
        * 2ª opcion: +1 linea -> BufferedReader(fr) -> readLine() -> has null
        *
        * */

        File f = new File("f.txt");

        try {
            FileReader fr = new FileReader(f);
            /*int caracter;
            while((caracter = fr.read()) != -1){
                System.out.print((char) caracter);
            }*/

            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
