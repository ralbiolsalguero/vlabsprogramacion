import java.io.*;

public class DataLeer {
    public static void main(String[] args) {


        try {
            File f = new File("dos.bin");
            DataInputStream dis = new DataInputStream(new FileInputStream(f));

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        /* FILEINPUTSTREAM VS DATAINPUTSTREAM
        Tipos de datos: bytes vs tipo de datos primitivos
        Abstración: bajo nivel vs alto nivel
        Metodos: read vs readInt, readUTF
        Relacion: directamente con archivos vs wrap sobre un FileInputStream
        Uso: Leer archivos binarios en crudo vs leer datos escritos con dataoutputstream

        * */


    }
}
