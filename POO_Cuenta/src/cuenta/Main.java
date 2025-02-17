package cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scn = new Scanner(System.in);
       String nombre, numero;
       double tipo, importe;

       Cuenta c1 = new Cuenta(); //Constructor por defecto

        System.out.println("Nombre: ");
        nombre = scn.nextLine();

        System.out.println("Número cuenta");
        numero = scn.nextLine();

        System.out.println("Tipo interes");
        tipo = scn.nextDouble();

        System.out.println("Importe");
        importe = scn.nextDouble();

        c1.setNombreCliente(nombre);
        c1.setNumeroCuenta(numero);
        c1.setTipoInteres(tipo);
        c1.setSaldo(importe);

        Cuenta c2 = new Cuenta("Juanito","8272662727727",1.76,500);//Constructor con parametros

        Cuenta c3 = new Cuenta(c1); //Constructor copia

        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre: "+c1.getNombreCliente());
        System.out.println("Número de cuenta: "+c1.getNumeroCuenta());
        System.out.println("Tipo interes: "+c1.getTipoInteres());
        System.out.println("Saldo: "+c1.getSaldo());

        c1.ingreso(500);

        System.out.println("Saldo: "+c1.getSaldo());

        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre: "+c2.getNombreCliente());
        System.out.println("Número de cuenta: "+c2.getNumeroCuenta());
        System.out.println("Tipo interes: "+c2.getTipoInteres());
        System.out.println("Saldo: "+c2.getSaldo());

        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre: "+c3.getNombreCliente());
        System.out.println("Número de cuenta: "+c3.getNumeroCuenta());
        System.out.println("Tipo interes: "+c3.getTipoInteres());
        System.out.println("Saldo: "+c3.getSaldo());

        if(c3.transferencia(c2,100)){
            System.out.println("Transferencia realizada");
        }else{
            System.out.println("No se ha podiod realizar la transferencia");
        }

        System.out.println("Saldo de cuenta2");
        System.out.println("Saldo: "+c2.getSaldo());

        System.out.println("Saldo de cuenta 3");
        System.out.println("Saldo: "+c3.getSaldo());

    }
}
