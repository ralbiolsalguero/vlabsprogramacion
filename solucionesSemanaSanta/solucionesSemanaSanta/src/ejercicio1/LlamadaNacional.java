package ejercicio1;

public class LlamadaNacional extends LlamadaLocal{
    private char destino; // A, B, o C

    public LlamadaNacional(double nOrigen, double nDestino, double duracion, char destino) {
        super(nOrigen, nDestino, duracion);
        this.destino = destino;
        calcularCoste(); // Calcula el coste basado en el destino
    }

    private void calcularCoste() {
        double tarifa;
        switch (destino) {
            case 'A':
                tarifa = 0.40;
                break;
            case 'B':
                tarifa = 0.50;
                break;
            case 'C':
                tarifa = 0.60;
                break;
            default:
                tarifa = 0; // Esto no deberÃ­a suceder
        }
        setCoste(getDuracion() * tarifa + 0.70);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de llamada: Nacional, Destino: " + destino);
    }

    // Getters y setters
    public char getDestino() {
        return destino;
    }

    public void setDestino(char destino) {
        this.destino = destino;
        calcularCoste(); // Recalcular el coste si el destino cambia
    }


}
