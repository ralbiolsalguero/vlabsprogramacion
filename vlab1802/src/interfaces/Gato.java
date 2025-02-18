package interfaces;

public class Gato implements Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El gato hace miau miau" + nombre);
    }
}
