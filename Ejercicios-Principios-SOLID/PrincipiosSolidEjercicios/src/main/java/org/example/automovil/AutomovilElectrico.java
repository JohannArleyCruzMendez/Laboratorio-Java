package org.example.automovil;




public class AutomovilElectrico extends Vehiculo {

    int autonomiaBateria;

    public AutomovilElectrico(TipoVehiculo tipo , TipoColor color, String marca,  int modelo, int númeroPuertas,int cantidadAsientos,int velocidadMáxima, int velocidadActual, int autonomiaBateria) {
        // 1. Primero, llama al constructor del padre con los parámetros que necesita
        super( tipo, color,marca,modelo,númeroPuertas, cantidadAsientos,velocidadMáxima,velocidadActual);

        // 2. Luego, inicializa los atributos de esta clase hija específica
        this.autonomiaBateria =autonomiaBateria;
    }


}
