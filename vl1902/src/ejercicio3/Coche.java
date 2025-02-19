package ejercicio3;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;

    }

    @Override
    public void tipoDeVehiculo() { //Abstracción
        System.out.println("Esto es un coche");
    }
    @Override
    public void conducir(){//Polimorfismo
        System.out.println("Conduciendo un coche: "+marca+" "+modelo);
    }
}
