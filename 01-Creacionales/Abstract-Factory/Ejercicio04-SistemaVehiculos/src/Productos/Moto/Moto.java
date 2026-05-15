package Productos.Moto;

import Productos.Vehiculo;

public abstract class Moto extends Vehiculo {
    public Moto(String modelo, String tipoEnergia, int velocidadMaxima) {
        super(modelo, tipoEnergia, velocidadMaxima);
    }

    public abstract void arrancar();


}
