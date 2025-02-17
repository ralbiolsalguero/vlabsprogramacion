package cuentaBancaria;

public class Cuenta {
    //Atributos: modificador de acceso(public/private) + tipo + nombre;
    //Encapsulación: Atributos privado y métodos publicos getters y setters
    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;

    //Métodos constructores: public Nombre de la Clase(){}
    //Parámetros, por defecto, copia
    //donde lo quiero = lo que quiero guardar
    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }


    //Métodos getters y setters

    public String getNombreCliente(){
        return nombreCliente;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public double getTipoInteres(){
        return tipoInteres;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //Resto de métodos

}
