import java.io.*;

public class DataEscribir {
    public static void main(String[] args) {


        try {
            File f = new File("dos.bin");
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));

            //número = writeInt();
            //texto = writeUTF();
            dos.writeInt(23);

            dos.writeUTF("Pepe");

            dos.writeInt(2025);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
