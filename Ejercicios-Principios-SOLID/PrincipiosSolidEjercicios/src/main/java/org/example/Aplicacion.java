//S - Responsabilidad Única (SRP)
//Empecemos con la "S". El Principio de Responsabilidad Única dice que:
//
//Una clase debe tener una, y solo una, razón para cambiar.

//S - Principio de Responsabilidad Única (SRP)
//Un trabajo por clase.
//
//Una clase debería tener solo una razón para cambiar. Esto significa que debe tener una única responsabilidad bien definida.
//
//Ejemplo: El único trabajo de la clase ImpresoraPersona es imprimir. No es responsable de guardar los datos de la persona.


package org.example;

public class Aplicacion {

    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 1990);
        ImpresoraPersona impresora = new ImpresoraPersona();

        impresora.imprimir(p1);
    }

}
