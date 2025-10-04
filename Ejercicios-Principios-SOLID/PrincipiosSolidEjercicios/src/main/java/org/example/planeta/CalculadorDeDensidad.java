package org.example.planeta;

public class CalculadorDeDensidad implements CalculoPlanetario{

    @Override
    public double calcular(Planeta planeta) {
        return planeta.masa/ planeta.volumen;
    }

}
