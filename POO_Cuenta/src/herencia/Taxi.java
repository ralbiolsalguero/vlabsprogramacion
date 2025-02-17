package herencia;

public class Taxi extends Vehiculo {
    public String numeroLicencia;

    public Taxi(String matricula, String modelo, int potenciaCV, String numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    public String getNumeroLicencia(){
        return numeroLicencia;
    }
}
