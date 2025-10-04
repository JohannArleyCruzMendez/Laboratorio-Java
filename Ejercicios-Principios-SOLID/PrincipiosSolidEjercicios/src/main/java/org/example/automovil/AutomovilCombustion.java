package org.example.automovil;

public class AutomovilCombustion extends Vehiculo{

    public enum TipoCombustible {
        GASOLINA,
        DIESEL,
        GAS_NATURAL
    }

    TipoCombustible combustible;

    public AutomovilCombustion(TipoVehiculo tipo , TipoColor color, String marca,  int modelo, int númeroPuertas,int cantidadAsientos,int velocidadMáxima, int velocidadActual, TipoCombustible combustible) {
        // 1. Primero, llama al constructor del padre con los parámetros que necesita
        super( tipo, color,marca,modelo,númeroPuertas, cantidadAsientos,velocidadMáxima,velocidadActual);

        // 2. Luego, inicializa los atributos de esta clase hija específica
        this.combustible = combustible;
    }


}




