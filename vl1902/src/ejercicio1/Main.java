package ejercicio1;

public class Main {
    public static void main(String[] args) {
        /*OPCION 1:
        Vehiculo v1 = new Vehiculo();
        Auto a1 = new Auto();
        Moto m1 = new Moto();*/
        /*OPCION 2:
        Vehiculo v2 = new Vehiculo();
        Vehiculo a2 = new Auto();
        Vehiculo b3 = new Moto();*/

        Vehiculo [] vehiculos = new Vehiculo[4];
        vehiculos[0] = new Auto();
        vehiculos[1] = new Moto();
        vehiculos[2] = new Auto();
        vehiculos[3] = new Moto();

        /*FOR*/
        for(int i = 0;i<vehiculos.length;i++){
            vehiculos[i].tipoDeVehiculo();
        }

        /*FOR EACH*/
        for(Vehiculo v: vehiculos){
            v.tipoDeVehiculo();
        }

        String [] palabras = {"Hola","Adios","Hola de nuevo"};

        for(String p: palabras){
            System.out.println(p);
        }


    }
}
