package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre;
        Scanner scn = new Scanner(System.in);

        //File f = new File("src/files3");

        /*
        if(f.isFile()){ //Este método comprueba si es un fichero
            System.out.println("El archivo indicado es un fichero");
        }*/

        /*try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*if(!f.exists()){ //Cuando el fichero no exista
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("El fichero ya existe");
        }*/

        /*if(f.canRead()){
            System.out.println("El fichero tiene permisos de lectura");
        }else{
            System.out.println("El fichero no tiene permisos de lectura");
        }

        if(f.canWrite()){
            System.out.println("El fichero tiene permisos de escritura");
        }else{
            System.out.println("El fichero no tiene permisos de escritura");
        }

        */
        /*if(f.exists()){
            if(f.delete()){
                System.out.println("El fichero se ha borrado correctamente");
            }else {
                System.out.println("Ha ocurrido algun error en el proceso de borrado");
            }
        }*/

        //System.out.println("La longitud del ficheo es: "+f.length());

        /*System.out.println("Indica el nuevo nombre del fichero");
        nombre = scn.next();

        if(f.renameTo(new File("src/files/"+nombre+".txt"))){
            System.out.println("Cambio realizado correctamente");
        }else{
            System.out.println("Error en el proceso de cambio de nombre");
        }*/

        /*if(f.isDirectory()){
            System.out.println("El fichero indicado es un directorio");
        }else{
            System.out.println("El fichero no es un directorio");
        }*/

        //f.mkdir();

        /*if(!f.exists()){
            f.mkdir();
        }else{
            System.out.println("El directorio ya existe");
        }*/

        /*if(f.exists()){
            if(f.delete()){
                System.out.println("El directorio se ha borrado correctamente");
            }else{
                System.out.println("Ha ocurrido un error en el proceso de borrado");
            }
        }else{
            System.out.println("Este directorio no existe");
        }*/

        /*File directorio = new File("C:\\");
        String [] lista = directorio.list();
        for(String item: lista){
            System.out.println(item);
        }*/

        File directorio = new File("C:\\");
        File [] f = directorio.listFiles();
        for(File item: f){
            System.out.println("La ruta del fichero es: "+item.getAbsolutePath());
        }


    }
}
