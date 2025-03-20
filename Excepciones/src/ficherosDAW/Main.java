package ficherosDAW;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //File, java.io

        //File f2 = new File("ejemplo.txt");
        File f = new File("src/ficherosDAW/ficheros/direjemplo");

        /*if(f.exists()){
            System.out.println("Este fichero existe");
        }else{
            System.out.println("Este fichero no existe");
        }*/

        /*if(f.isFile()){
            System.out.println("Esto es un fichero");
        }else{
            System.out.println("Esto no es un fichero");
        }

        if(f.isDirectory()){
            System.out.println("Esto es un directorio");
        }else{
            System.out.println("Esto no es un directorio");
        }*/


        /*if(!f.exists()){
            try {
                f.createNewFile();
                System.out.println("El fichero se ha creado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("El fichero ya existe");
        }*/

        /*if(f.canRead()){
            System.out.println("El fichero tiene permiso de lectura");
        }else{
            System.out.println("El fichero no tiene permiso de lectura");
        }

        if(f.canWrite()){
            System.out.println("El fichero tiene permiso de escritura");
        }else{
            System.out.println("El fichero no tiene permiso de escritura");
        }*/

        /*if(f.exists()){
            if(f.delete()){
                System.out.println("El fichero se ha borrado correctamente");
            }else{
                System.out.println("Ha ocurrido algún error en el proceso de borrado");
            }
        }else{
            System.out.println("El fichero no existe");
        }*/

        //System.out.println(f.length());
        /*Scanner scn = new Scanner(System.in);
        String nombre;
        System.out.println("Introduzca el nuevo nombre de nuestro fichero");
        nombre = scn.next();

        if(f.renameTo(new File("src/ficherosDAW/ficheros/"+nombre+".txt"))){
            System.out.println("Cambio realizado correctamente");
        }else{
            System.out.println("Error en el proceso de cambio de nombre");
        }*/
        /*
        if(f.isDirectory()){
            System.out.println("Es un directorio");
        }else{
            System.out.println("No es un directorio");
        }*/
    /*
        f.mkdir(); //Solo funciona si el directorio padre ya existe
        System.out.println(f.length());

        f.mkdirs(); //Crea todo los directorios necesarios
*/

        File directorio = new File("C:\\");

        //MÉTODO LIST

        if(directorio.isDirectory()){
            String [] archivos = directorio.list(); //Me hace una lista de los nombres de ficheros y directorios de un directorio
            System.out.println("Archivos en "+directorio.getName()+":");
            for(String archivo : archivos){
                System.out.println(" - "+archivo);
            }
        }

        //MÉTODO LISTFILES

        File [] ficheros = directorio.listFiles();
        for(File item: ficheros){
            System.out.println("La ruta del fichero es: "+item.getAbsolutePath());
        }

        /* EJERCICIO 1
         * 1. Crear un archivo
         * 2. Eliminar un archivo
         * 3. Mostrar inforamción del archivo
         * 4. Crear un directorio
         * 5. Listas archivos en un directorio
         * 6. Salir
         * */


        /* EJERCICIO 2
         * Crea una aplicación de listado. Para ello el sistema deberá mostrar por consola
         * de forma recursiva todas las carpetas, subcarpetas y ficheros de una ruta concreta
         * (por ejemplo, la carpeta del directorio de tu perfil), nada más arrancar la apliación
         * */


    }
}
