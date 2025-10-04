package org.example.CuentaBancaria;


public class ServicioBancario {


    //El servicio depende de la ABSTRACCIÓN, no del detalle
    private IRepositorioDeCuentas repositorio;

    // La dependencia se inyecta en el constructor
    public ServicioBancario(IRepositorioDeCuentas repositorio) {
        this.repositorio = repositorio;
    }

    // Los métodos del servicio USAN la herramienta
    public void abrirCuenta(CuentaBancaria cuenta) {
        this.repositorio.guardarCuenta(cuenta);
    }

    public CuentaBancaria consultarCuenta(String numeroDeCuenta) {
        return this.repositorio.buscarCuenta(numeroDeCuenta);
    }
}


