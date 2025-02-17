package herencia;

public class Autobus extends Vehiculo {
    public int numeroPlazas;

    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }


}
