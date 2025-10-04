package org.example.planeta;

public class VerificadorPlanetaExterior implements CalculoPlanetario {

    @Override
    public double calcular(Planeta planeta) {
        // Your logic is here, just using the 'planeta' object
        double limiteUA = 149597870 * 3.4;

        if (planeta.distanciaSol > limiteUA) {

            return 1.0; // Represents 'true'

        } else {


            return 0.0; // Represents 'false'
        }
    }






}
