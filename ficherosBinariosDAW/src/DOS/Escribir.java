package DOS;

import java.io.*;

public class Escribir {
    public static void main(String[] args) {

        //DataOutputStream

        File f = new File("dos.bin");

        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
            dos.writeInt(20);
            dos.writeUTF("Pepe");
            dos.writeInt(50);




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*FILEINPUTSTREAM VS DATAINPUTSTREAM*/
        /*
        * Tipo de datos: bytes vs tipo de dato primitivo
        * Métodos: read() vs readInt(), readUTF()
        * Relación: directamente con archivos vs wrap sobre un FileInputStream
        * Uso: Leer archivos binarios en crudo vs leer datos escritos con DataOutputStream
        * Abstración: bajo nivel vs alto nivel
        * */


    }
}
