package Productos.Camioneta;

import Productos.Vehiculo;

public abstract class Camioneta extends Vehiculo {
    public Camioneta(String modelo, String tipoEnergia, int velocidadMaxima) {
        super(modelo, tipoEnergia, velocidadMaxima);
    }

    public abstract void transportar();
}
