package ejercicio3;

public class Moto extends Vehiculo{

    private boolean tieneSidecar;

    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void tipoDeVehiculo() { //Abstracción
        System.out.println("Esto es una moto");
    }

    @Override
    public void conducir(){ //Polimorfiso
        System.out.println("Conduciendo una moto: "+marca+" "+modelo);
    }

    public void mostrarSidecar(){
        if(tieneSidecar){
            System.out.println("La moto tiene sidecar");
        }else{
            System.out.println("La moto no tiene sidecar");
        }
    }
}
