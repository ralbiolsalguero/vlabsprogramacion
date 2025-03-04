package ejercicio2;

import java.util.ArrayList;

public class GestorPersonas {

    //Método para mostrar nombres y generos

    public static void mostrarNombreYGenero(ArrayList<Persona> p){
        for(int i = 0;i<p.size();i++){ //i = 1
            Persona persona = p.get(i); //p.get(1)
            System.out.println("Persona "+i+" --> Nombre: "+ persona.getNombre()+" Género --> "+persona.getGenero());
        }
    }

    //Método para promedio de edades

    public static double promedioEdades(ArrayList<Persona> p){
        double sumaEdades = 0;
        double promedio;
        for(Persona persona: p){
            sumaEdades += persona.getEdad();
        }
        promedio = sumaEdades / p.size();
        return promedio;
    }

    //Método contar personas masculinas
    public static int contarPersonasMasculinas(ArrayList<Persona> p){
        int cont = 0;
        for(Persona persona: p){
            if(persona.getGenero().equals("M")){
                cont++;
            }
        }
        return cont;
    }


    //Método contar personas femeninas
    public static int contarPersonasFemeninas(ArrayList<Persona> p){
        int cont = 0;
        for(Persona persona: p){
            if(persona.getGenero().equals("F")){
                cont++;
            }
        }
        return cont;
    }
}
