package ejercicio3;

public abstract class Vehiculo implements Conducible{

    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void tipoDeVehiculo();

    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo un vehiculo");
    }

    public void mostrarInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}
