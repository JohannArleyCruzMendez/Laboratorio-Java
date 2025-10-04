package org.example.automovil;

//Principios SOLID: L - Sustitución de Liskov (LSP)
//Ahora, retomemos el tercer principio. Suena complicado, pero la idea es simple:
//Los objetos de una clase hija deben poder sustituir a los objetos de una clase padre sin romper el programa.
//L - Principio de Sustitución de Liskov (LSP)
//Las clases hijas deben poder sustituir a sus padres sin causar problemas.
//
//Una subclase debe ser sustituible por su clase padre en cualquier situación sin alterar el correcto funcionamiento del programa. La clase hija no debe romper las "promesas" de la clase padre.
//
//Ejemplo: Un AutomovilElectrico es un sustituto perfecto de un Vehiculo porque implementa correctamente todos los métodos del padre, como acelerar().
public class Aplicacion {


    public static void main(String[] args) {

        // Create a combustion car with the correct constructor order
        AutomovilCombustion carro1 = new AutomovilCombustion(
                TipoVehiculo.SEDAN,
                TipoColor.NEGRO,
                "Ford",
                2023,
                4,
                5,
                220,
                0, // Initial speed
                AutomovilCombustion.TipoCombustible.GASOLINA
        );

        // Create an electric car with the correct constructor order
        AutomovilElectrico carro2 = new AutomovilElectrico(
                TipoVehiculo.SEDAN,
                TipoColor.BLANCO,
                "Tesla",
                2024,
                4,
                5,
                250,
                0, // Initial speed
                500 // Autonomy in km
        );

        // Accelerate both vehicles
        carro1.acelerar(100);
        carro2.acelerar(120);

        // Print their speeds
        System.out.println("Velocidad del carro de combustión: " + carro1.getVelocidadActual() + " km/h");
        System.out.println("Velocidad del carro eléctrico: " + carro2.getVelocidadActual() + " km/h");
    }
}







