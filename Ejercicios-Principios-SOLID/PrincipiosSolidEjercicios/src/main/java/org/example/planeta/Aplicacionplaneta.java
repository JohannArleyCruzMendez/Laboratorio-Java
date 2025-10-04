//  El Principio de Abierto / Cerrado dice que:
//
//Una clase debe estar abierta para su extensión, pero cerrada para su modificación.
//
//Esto significa que deberíamos poder añadir nuevas funcionalidades sin cambiar el código que ya existe.
//O - Principio de Abierto/Cerrado (OCP)
//Abierto para la extensión, cerrado para la modificación.
//
//Deberías poder añadir nueva funcionalidad a un sistema sin cambiar el código existente. Esto se logra usualmente usando interfaces o clases abstractas.
//
//Ejemplo: Podríamos añadir una nueva clase CalculoDeGravedad sin tocar nunca las clases originales Planeta o CalculadorDeDensidad.


package org.example.planeta;

import org.example.planeta.Planeta;


public class Aplicacionplaneta {

    public static void main(String[] args) {
        // El código de acción va aquí adentro
        Planeta tierra = new Planeta(
                "Tierra",
                1,
                5.972E24,
                1.08321E12,
                12742,
                150,
                Planeta.TipoPlaneta.TERRESTRE,
                true
        );

        CalculoPlanetario calculadorDeDensidad = new CalculadorDeDensidad();
        double densidadTierra = calculadorDeDensidad.calcular(tierra);
        System.out.println("La densidad de la Tierra es: " + densidadTierra);


        VerificadorPlanetaExterior verficacion =  new VerificadorPlanetaExterior();
        double verificacion = verficacion.calcular(tierra);
        System.out.println("si es 0.0 el planeta no es exterior si es mayor o == 1.0 es el planeta es exterior: " + verificacion);

        if (verificacion==1.0){
            System.out.println("La Tierra es un planeta exterior.");
        }else{
            System.out.println("La Tierra no es un planeta exterior.");
        }

        }


    }







