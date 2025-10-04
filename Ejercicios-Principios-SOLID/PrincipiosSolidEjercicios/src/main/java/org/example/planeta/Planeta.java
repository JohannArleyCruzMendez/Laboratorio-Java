package org.example.planeta;

public class Planeta {

    // Primero, definimos el enum para el tipo de planeta
    public enum TipoPlaneta {
        GASEOSO,
        TERRESTRE,
        ENANO
    }

    // Luego, los atributos de la clase
    String nombre;
    int cantidadSatelites;
    double masa;
    double volumen;
    int diametro;
    int distanciaSol;
    TipoPlaneta tipo; // Usamos nuestro enum
    boolean esObservable;

    // Aquí irá el constructor

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, TipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }


}
