package excepcionconthrow;

public class Main {

    public static void main(String[] args) {

        //Lanzar excepción personalizada si la edad es menor a 18
        try{
            validarEdad(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
    static void validarEdad(int edad){
        if(edad<18){
            //Coche c1 = new Coche("16535GHJ");
            //coche.arrancar();
            throw new IllegalArgumentException("Debe ser mayor a 18 años");
        }
        System.out.println("Acceso permitido");
    }

}
