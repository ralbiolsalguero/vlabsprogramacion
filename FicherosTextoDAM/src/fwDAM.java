import java.io.*;

public class fwDAM {
    public static void main(String[] args) {

        /*--- ESCRITURA ---*/

        //FileWriter -> write("Hola mundo \n") MODO ANEXAR: true, false
        //BufferedWriter(fw) -> newLine(), write()
        //PrintWriter(bw / fw) -> print(), println()

        File f = new File("fw.txt");
        /*try {
            FileWriter fw = new FileWriter(f,true);

            fw.write("Adios \n");

            fw.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

*/
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("Primera linea con BufferedWriter");
            bw.newLine();
            bw.write("Segunda linea");


            PrintWriter pw = new PrintWriter(bw);
            pw.println("Tercera linea con PrintWriter");
            pw.print("Cuarta linea sin salto");

            pw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
