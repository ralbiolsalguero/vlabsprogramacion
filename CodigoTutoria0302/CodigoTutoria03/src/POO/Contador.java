package POO;

public class Contador {

    private int cont;

    //constructor por defecto
    public Contador() {
    }

    //constructor con parámetros
    public Contador(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    //constructor copia
    public Contador(final Contador c) {
        cont = c.cont;
    }

    //getter
    public int getCont() {
        return cont;
    }

    //setter
    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    //método incrementar contador
    public void incrementar() {
        cont++;
    }

    //método decrementar contador
    public void decrementar() {
        cont--;
        if (cont < 0) {
            cont = 0;
        }
    }
}
