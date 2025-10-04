package org.example.CuentaBancaria;
import java.util.Map;
import java.util.HashMap;


public class RepositorioEnMemoria implements IRepositorioDeCuentas {

    // Usamos un Map para simular nuestra base de datos en memoria
    private Map<String, CuentaBancaria> cuentasGuardadas = new HashMap<>();

    @Override
    public void guardarCuenta(CuentaBancaria cuenta) {
        cuentasGuardadas.put(cuenta.getNumeroDeCuenta(), cuenta);
        System.out.println("Cuenta " + cuenta.getNumeroDeCuenta() + " guardada.");
    }

    @Override
    public CuentaBancaria buscarCuenta(String numeroDeCuenta) {
        System.out.println("Buscando cuenta " + numeroDeCuenta + "...");
        return cuentasGuardadas.get(numeroDeCuenta);
    }
}


