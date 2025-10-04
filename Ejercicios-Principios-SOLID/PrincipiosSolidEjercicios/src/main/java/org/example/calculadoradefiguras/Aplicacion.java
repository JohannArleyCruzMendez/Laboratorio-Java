package org.example.calculadoradefiguras;

// El Principio en Acción
//Este código demuestra el poder del Principio de Segregación de Interfaces:
//
//La variable miCirculo solo "conoce" los métodos definidos en IFiguraGeometrica. No está "contaminada" con métodos de triángulos que no le sirven.
//
//La clase Triangulo puede acceder a todos los métodos porque implementa ambas interfaces, dándole una funcionalidad más rica.
//
//Cada clase usa solo los contratos que necesita, haciendo el código más seguro, limpio y fácil de entender.


//I - Principio de Segregación de Interfaces (ISP)
//No fuerces a las clases a implementar métodos que no necesitan.
//
//Es mejor tener muchas interfaces pequeñas y específicas que una sola grande y de propósito general.
//
//Ejemplo: La clase Circulo solo implementa la interfaz IFiguraGeometrica y no está forzada a tener un método calcularHipotenusa().



public class Aplicacion {

    public static void main(String[] args) {

        // --- Probando el Círculo ---
        // Creamos un Círculo y lo tratamos como una figura geométrica general.
        IFiguraGeometrica miCirculo = new Circulo(10.0); // radio de 10 cm

        System.out.println("--- Círculo ---");
        System.out.println("Área: " + miCirculo.calcularArea());
        System.out.println("Perímetro: " + miCirculo.calcularPerimetro());
        // Nota: No podemos llamar a miCirculo.calcularHipotenusa(), ¡y eso es bueno!
        // El contrato de IFiguraGeometrica no nos lo permite.

        System.out.println(); // Añadimos un salto de línea para separar.

        // --- Probando el Triángulo ---
        // Creamos un Triángulo y necesitamos su tipo específico para acceder a todos sus métodos.
        Triangulo miTriangulo = new Triangulo(3.0, 4.0); // base 3, altura 4

        System.out.println("--- Triángulo Rectángulo ---");
        System.out.println("Área: " + miTriangulo.calcularArea()); // Método de IFiguraGeometrica
        System.out.println("Perímetro: " + miTriangulo.calcularPerimetro()); // Método de IFiguraGeometrica
        System.out.println("Hipotenusa: " + miTriangulo.calcularHipotenusa()); // Método de ITriangulo
        System.out.println("Tipo: " + miTriangulo.determinarTipo()); // Método de ITriangulo
    }


}
