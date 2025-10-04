package org.example.calculadoradefiguras;

public class Circulo implements IFiguraGeometrica {

    // 1. Atributo específico del círculo
    private double radio;

    // 2. Constructor para inicializar el atributo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // 3. Implementación de los métodos de la interfaz
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula del área: π * r²
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Fórmula del perímetro: 2 * π * r
    }


}
