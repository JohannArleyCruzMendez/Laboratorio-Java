package org.example.automovil;



import org.example.planeta.Planeta;

public class Vehiculo {

    String marca;
    int modelo;
    int númeroPuertas;
    int cantidadAsientos;
    int velocidadMáxima;
    int velocidadActual = 0;

    TipoVehiculo tipo;

    TipoColor color;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Vehiculo(TipoVehiculo tipo , TipoColor color, String marca, int modelo, int númeroPuertas, int cantidadAsientos, int velocidadMáxima, int velocidadActual) {

        this.tipo=tipo;
        this.color = color;
        this.marca=marca;
        this.modelo = modelo;
        this.númeroPuertas= númeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMáxima = velocidadMáxima;
        this.velocidadActual = velocidadActual;

    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNúmeroPuertas() {
        return númeroPuertas;
    }

    public void setNúmeroPuertas(int númeroPuertas) {
        this.númeroPuertas = númeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }

    public void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad <= velocidadMáxima) {
            velocidadActual += incrementoVelocidad; // Una forma más corta de escribir lo mismo
        } else {
            System.out.println("No se puede acelerar a una velocidad superior a la máxima del automóvil.");
        }
    }

    public void desacelerar(int decrementoVelocidad) {
        if (velocidadActual - decrementoVelocidad >= 0) {
            velocidadActual -= decrementoVelocidad; // Una forma más corta de escribirlo
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }


    }













