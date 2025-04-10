package ejercicioejemplo;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num;

        System.out.println("Introduzca la tabla de multiplicar que quiere guardar");
        num = scn.nextInt();

        String ruta = "tabla-"+num+".txt";

        File f = new File(ruta);

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f));
            for(int i = 1;i<=10;i++){
                pw.println(num+" x "+i+" = "+(i*num));
            }
            pw.close();
            System.out.println("Tabla del "+num+" guardada con éxito");

            BufferedReader bw = new BufferedReader(new FileReader(f));
            String linea;
            while((linea = bw.readLine()) != null){
                System.out.println(linea);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
