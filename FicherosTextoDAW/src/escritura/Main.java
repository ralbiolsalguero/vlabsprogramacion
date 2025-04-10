package escritura;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*ESCRITURA*/

        //FileWriter -> write("Hola mundo\n");
        //BufferedWriter (fw) -> newLine(), write(); NO SE USA
        //PrintWriter(bw/fw) -> print(), println()

        File f = new File("f.txt");

        try {
            FileWriter fw = new FileWriter(f);
            /*fw.write("Adios");

            fw.close();*/
            /*BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hola mundo");
            bw.newLine();
            bw.write("Adios");
            bw.close();*/

            PrintWriter pw = new PrintWriter(fw);
            pw.println("Hola mundo");
            pw.println("Adios");
            pw.println("Trabajando con PrintWriter");
            pw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
