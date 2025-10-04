package org.example;
// este es un ejercicio basico para dominar el principio de responabilidad unica
//  ¡Correcto! Una clase es el "molde" que tiene los espacios definidos para guardar los datos (los atributos).
//
//Una interfaz es más como un "contrato" 📜 que solo se preocupa por las acciones (métodos), pero no tiene un lugar para guardar los datos de cada objeto.
public class Persona {

    String nombre;
    int anoNacimiento;

    public Persona(String nombre, int anoNacimiento) {
        this.nombre = nombre;
        this.anoNacimiento = anoNacimiento;
    }

}
