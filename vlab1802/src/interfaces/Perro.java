package interfaces;

public class Perro implements Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El Perro hace guau guau "+nombre);
    }
}
