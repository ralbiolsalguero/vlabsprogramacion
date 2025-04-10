package lectura;

import java.io.FileWriter;

public class Ejemplo {
    public static void main(String[] args) {

        String archivo = "archivo.txt";

        try(FileWriter fw = new FileWriter(archivo)){
            fw.write("Este archivo se cierra solo");
            fw.write("Y no usamos .close");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
