package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        //ArrayList -> Lista de objetos, lista de longitud variable
        //Array -> Longitud fija

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(20); //0
        listaNumeros.add(40); //1
        listaNumeros.add(5); //2
        listaNumeros.add(2); //3

        for(int i = 0;i<listaNumeros.size();i++){
            System.out.println(listaNumeros.get(i));
        }

        Collections.sort(listaNumeros);

        for(int i: listaNumeros){
            System.out.println(i);
        }

        Collections.reverse(listaNumeros);

        for(int i: listaNumeros){
            System.out.println(i);
        }

        ArrayList<String> nombre = new ArrayList<>();
        nombre.add("Pedro");
        nombre.add("Gabriel");
        nombre.add("Rosa");
        nombre.add("Marta");

        Collections.sort(nombre);

        for(String i: nombre){
            System.out.println(i);
        }

        Collections.reverse(nombre);

        for(String i: nombre){
            System.out.println(i);
        }










    }
}
