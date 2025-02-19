package ejercicio2;

public class Main {
    public static void main(String[] args) {
        /*OPCION 1:
        * Circulo c1 = new Circulo();
        * Rectangulo r1 = new Rectangulo();
        * */

        Figura circulo = new Circulo(10);
        Figura rectangulo = new Rectangulo(4,5);

        System.out.println("Área del circulo "+circulo.calcularArea());
        System.out.println("Área del rectángulo "+rectangulo.calcularArea());


    }
}
