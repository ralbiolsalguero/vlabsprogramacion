package ejercicio1;

public class Centralita {

    private int costeAcumulado;

    public Centralita() {
        this.costeAcumulado = 0;
    }

    public void agregarLocal(LlamadaLocal llamada) {
        costeAcumulado += llamada.getCoste();
    }

    public void agregarNacional(LlamadaNacional llamada) {
        costeAcumulado += llamada.getCoste();
    }

    public int getCosteAcumulado() {
        return costeAcumulado;
    }

}
