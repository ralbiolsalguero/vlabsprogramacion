package ejercicio2;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        double resultado;
        resultado = Math.PI*radio*radio;
        return resultado;
    }
}
