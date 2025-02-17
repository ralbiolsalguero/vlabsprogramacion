package cuenta;

public class Cuenta {
    //Atributos
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Constructores: Parametros, defecto, copia

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public Cuenta() {

    }

    public Cuenta(Cuenta c) {
        this.nombreCliente = c.nombreCliente;
        this.saldo = c.saldo;
        this.tipoInteres = c.tipoInteres;
        this.numeroCuenta = c.numeroCuenta;
    }

    //Getter y setters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public boolean ingreso(double importe) {
        boolean resultado = false;
        if (importe > 0) {
            this.saldo += importe;
            resultado = true;
        }
        return resultado;
    }

    public boolean reintegro(double importe) {
        boolean resultado = false;
        if (importe > 0 && this.saldo >= importe) {
            this.saldo -= importe;
            resultado = true;
        }
        return resultado;
    }

    public boolean transferencia(Cuenta c, double importe) {
        boolean resultado = false;
        if (this.reintegro(importe)) {
            c.ingreso(importe);
            resultado = true;
        }
        return resultado;
    }

}
