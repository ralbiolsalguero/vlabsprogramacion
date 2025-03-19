package ejercicio11121314;

public class Main {
    public static void main(String[] args) {

        double [] v = new double[15];
        acceso_por_indice(v, 16);

    }

    public static double acceso_por_indice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j <v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j + " no existe en el vector");
            }

        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}
