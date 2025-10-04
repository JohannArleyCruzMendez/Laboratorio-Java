package org.example.CuentaBancaria;

public interface IRepositorioDeCuentas {

    void guardarCuenta(CuentaBancaria cuenta);
    CuentaBancaria buscarCuenta(String numeroDeCuenta);


}