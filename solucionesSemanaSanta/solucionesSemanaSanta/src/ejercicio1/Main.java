package ejercicio1;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Centralita
        Centralita centralita = new Centralita();

        // Crear y agregar llamadas locales
        LlamadaLocal llamadaLocal1 = new LlamadaLocal(123456789, 987654321, 60); // 60 segundos
        LlamadaLocal llamadaLocal2 = new LlamadaLocal(111222333, 444555666, 120); // 120 segundos
        centralita.agregarLocal(llamadaLocal1);
        centralita.agregarLocal(llamadaLocal2);

        // Crear y agregar llamadas nacionales
        LlamadaNacional llamadaNacional1 = new LlamadaNacional(222333444, 555666777, 30, 'A'); // 30 segundos, destino A
        LlamadaNacional llamadaNacional2 = new LlamadaNacional(888999000, 111222333, 45, 'B'); // 45 segundos, destino B
        centralita.agregarNacional(llamadaNacional1);
        centralita.agregarNacional(llamadaNacional2);

        // Mostrar datos de las llamadas y el coste acumulado
        System.out.println("Datos de las llamadas locales:");
        llamadaLocal1.mostrarDatos();
        llamadaLocal2.mostrarDatos();

        System.out.println("\nDatos de las llamadas nacionales:");
        llamadaNacional1.mostrarDatos();
        llamadaNacional2.mostrarDatos();

        System.out.println("\nCoste acumulado en la centralita: " + centralita.getCosteAcumulado() + " euros");
    }

}

