import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*FICHEROS DE TEXTO*/

        /*--- LECTURA ---*/
        /*--1 LINEA--*/
        //FileReader -> read() ASCII 595163561-1

        /*--MÁS DE 1 LINEA--*/
        //BufferedReader(fr) -> readLine() hasta null

        /*--- ESCRITURA ---*/

        //FileWriter -> write("Hola mundo \n") MODO ANEXAR: true, false
        //BufferedWriter(fw) -> newLine(), write()
        //PrintWriter(bw / fw) -> print(), println()


        File f = new File("prueba.txt");
        /*try {

            FileReader fr = new FileReader(f);
            int caracter;
            while((caracter = fr.read()) != -1){
                System.out.print((char) caracter);
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
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
