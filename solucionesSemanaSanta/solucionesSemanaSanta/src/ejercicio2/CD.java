package ejercicio2;

public class CD {
    private Cancion[] canciones;
    private int contador; // Sigue la siguiente posición libre en el array

    public CD() {
        this.canciones = new Cancion[10]; // Asumiendo un tamaño fijo para simplificar
        this.contador = 0;
    }

    public int numeroCanciones() {
        return contador;
    }

    public Cancion dameCancion(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            return canciones[posicion];
        }
        return null; // Posición inválida
    }

    public void grabaCancion(int posicion, Cancion cancion) {
        if (posicion >= 0 && posicion < canciones.length) {
            canciones[posicion] = cancion;
            if (posicion == contador) { // Asumiendo que no se dejan "huecos" en el array
                contador++;
            }
        }
    }

    public void agrega(Cancion cancion) {
        if (contador < canciones.length) {
            canciones[contador++] = cancion;
        } else {
            System.out.println("No hay espacio para agregar más canciones.");
        }
    }

    public void elimina(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            for (int i = posicion; i < contador - 1; i++) {
                canciones[i] = canciones[i + 1];
            }
            canciones[contador - 1] = null; // Elimina la referencia al último objeto
            contador--;
        }
    }
}

