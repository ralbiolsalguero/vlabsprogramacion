package herencia;

public class Vehiculo {
    public String matricula;
    public String modelo;
    public int potenciaCV;

    public Vehiculo(String matricula, String modelo, int potenciaCV){
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula(){
        return matricula;
    }
    public String getModelo(){
        return modelo;
    }
    public int getPotenciaCV(){
        return potenciaCV;
    }

}
