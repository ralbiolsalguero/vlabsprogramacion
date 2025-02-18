package polimorfismo;

public class Animal {

    public void sonidoAnimal(){
        System.out.println("El animal hace un sonido");
    }

}

class Perro extends Animal{
    @Override
    public void sonidoAnimal(){
        System.out.println("El perro hace guau guau");
    }
}

class Gato extends Animal{
    @Override
    public void sonidoAnimal(){
        System.out.println("El gato hace miau miau");
    }
}