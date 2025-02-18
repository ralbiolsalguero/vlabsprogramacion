package abstraccion;

public abstract class Animal {

    public abstract void sonidoAnimal(String nombre);


}

class Perro extends Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El perro hace guau guau");
    }
}

class Gato extends Animal{

    @Override
    public void sonidoAnimal(String nombre) {
        System.out.println("El Gato hace miau miau");
    }
}