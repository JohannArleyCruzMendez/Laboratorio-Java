package org.example.CuentaBancaria;

public class CuentaBancaria {

    public enum TipoCuenta {
        AHORROS,
        CORRIENTE
    }

    private String nombresTitular;
    private String apellidosTitular;
    private String numeroDeCuenta;
    private TipoCuenta tipo;
    private double saldo;

    // Constructor
    public CuentaBancaria(String nombresTitular, String apellidosTitular, String numeroDeCuenta, TipoCuenta tipo) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipo = tipo;
        this.saldo = 0; // El saldo inicial siempre es cero.
    }


    public String getNombresTitular() {
        return nombresTitular;
    }

    public void setNombresTitular(String nombresTitular) {
        this.nombresTitular = nombresTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public void setApellidosTitular(String apellidosTitular) {
        this.apellidosTitular = apellidosTitular;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
