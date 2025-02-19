package ejercicio2;

public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        double resultado;
        resultado = base * altura;
        return resultado;
    }
}
