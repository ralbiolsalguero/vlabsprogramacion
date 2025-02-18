package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.sonidoAnimal();

        Perro perro1 = new Perro();
        perro1.sonidoAnimal();

        Gato gato1 = new Gato();
        gato1.sonidoAnimal();
    }
}
