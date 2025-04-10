import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tablasMultiplicar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mult;


        System.out.println("Introduzca el número de la tabla de multiplicar");
        mult = scn.nextInt();

        String archivo = "tabla"+mult+".txt";

        FileWriter fw = null;
        try {
            fw = new FileWriter(archivo);
            PrintWriter pw = new PrintWriter(fw);

            int num = mult;
            for(int i = 1;i<=10;i++){
                pw.println(num + "X"+ i + " = "+(num*i));
            }
            pw.close();
            System.out.println("Tabla del "+mult+" guardada en "+archivo);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
