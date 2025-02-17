package ejemplo_super;

public class Main {
    public static void main(String[] args) {

        Abuelo a = new Abuelo();
        Nieto n = new Nieto();
        Hijo h = new Hijo();

        a.saludar();
        h.saludar();
        n.saludar();

    }

}
