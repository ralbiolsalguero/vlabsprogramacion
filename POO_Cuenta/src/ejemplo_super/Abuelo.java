package ejemplo_super;

public class Abuelo {

    public void saludar() {
        System.out.println("Soy el abuelo");
    }

}

class Hijo extends Abuelo {
    public void saludar() {
        super.saludar();
        System.out.println("Hola ahora soy el hijo");
    }
}

class Nieto extends Hijo {
    public void saludar() {
        super.saludar();
        System.out.println("Hola ahora soy el nieto");
    }
}
