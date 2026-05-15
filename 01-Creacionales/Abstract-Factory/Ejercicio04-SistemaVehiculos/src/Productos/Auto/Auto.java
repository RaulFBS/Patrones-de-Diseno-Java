package Productos.Auto;

import Productos.Vehiculo;

public abstract class Auto extends Vehiculo {
    public Auto(String modelo, String tipoEnergia, int velocidadMaxima) {
        super(modelo, tipoEnergia, velocidadMaxima);
    }

    public abstract void conducir();


}
