package ejercicio1;

public class LlamadaLocal {
    private long numeroOrigen;
    private long numeroDestino;
    private double coste;
    private double duracion; // En segundos

    public LlamadaLocal(double nOrigen, double nDestino, double duracion) {
        this.numeroOrigen = (long) nOrigen;
        this.numeroDestino = (long) nDestino;
        this.duracion = duracion;
        this.coste = duracion * 0.15 + 0.50; // Coste por segundo mÃ¡s establecimiento
    }

    public void mostrarDatos() {
        System.out.println("Origen: " + numeroOrigen + ", Destino: " + numeroDestino +
                ", DuraciÃ³n: " + duracion + " segundos, Coste: " + coste + " euros");
    }

    // Getters y setters
    public long getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(long numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public long getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(long numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

}
