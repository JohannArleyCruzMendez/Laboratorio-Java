package org.example.calculadoradefiguras;

public class Triangulo implements IFiguraGeometrica, ITriangulo{



        // Atributos específicos del triángulo
        private double base;
        private double altura;

        // Constructor
        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        // --- Métodos de IFiguraGeometrica ---
        @Override
        public double calcularArea() {
            return (base * altura) / 2;
        }

        @Override
        public double calcularPerimetro() {
            // Para un triángulo rectángulo
            double hipotenusa = calcularHipotenusa();
            return base + altura + hipotenusa;
        }

        // --- Métodos de ITriangulo ---
        @Override
        public double calcularHipotenusa() {
            // Usando el Teorema de Pitágoras: a² + b² = c²
            return Math.sqrt((base * base) + (altura * altura));
        }

        @Override
        public String determinarTipo() {
            // Esta es una simplificación; un cálculo real sería más complejo
            if (base == altura) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        }
    }



