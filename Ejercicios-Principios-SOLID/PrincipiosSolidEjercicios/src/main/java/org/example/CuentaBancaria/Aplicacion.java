//D - Principio de Inversión de Dependencias (DIP)
//Depende de abstracciones (interfaces), no de clases concretas.
//
//La lógica de negocio de alto nivel no debería depender de los detalles de implementación de bajo nivel. Ambas deberían depender de una interfaz compartida.
//
//Ejemplo: El ServicioBancario depende de la interfaz IRepositorioDeCuentas, no directamente de la clase RepositorioEnMemora. Esto nos permite cambiar fácilmente la base de datos más adelante.








package org.example.CuentaBancaria;

public class Aplicacion {


        public static void main(String[] args) {

            // 1. Creamos la "herramienta" de bajo nivel (nuestra base de datos en memoria).
            IRepositorioDeCuentas miRepositorio = new RepositorioEnMemoria();

            // 2. Creamos el "trabajador" de alto nivel y le "inyectamos" la herramienta.
            // El servicio no sabe que es un RepositorioEnMemoria, solo que es un IRepositorioDeCuentas.
            ServicioBancario miServicio = new ServicioBancario(miRepositorio);

            // 3. Usamos el servicio para realizar nuestras operaciones de negocio.
            System.out.println("--- Abriendo una nueva cuenta ---");
            CuentaBancaria nuevaCuenta = new CuentaBancaria(
                    "Juan",
                    "Perez",
                    "123456789",
                    CuentaBancaria.TipoCuenta.AHORROS
            );
            miServicio.abrirCuenta(nuevaCuenta);

            System.out.println("\n--- Consultando la cuenta ---");
            CuentaBancaria cuentaConsultada = miServicio.consultarCuenta("123456789");

            if (cuentaConsultada != null) {
                System.out.println("Cuenta encontrada. Saldo: " + cuentaConsultada.getSaldo());
            } else {
                System.out.println("La cuenta no fue encontrada.");
            }
        }
    }


