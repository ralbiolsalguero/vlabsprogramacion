package DOS;

import java.io.*;

public class Leer {
    public static void main(String[] args) {

        File f = new File("dos.bin");
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(f));

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
