package Fabricas;

import Productos.Bebida.Bebida;
import Productos.Bebida.BebidaJaponesa;
import Productos.Entrada.Entrada;
import Productos.Entrada.EntradaJaponesa;
import Productos.PlatoPrincipal.PlatoPrincipal;
import Productos.PlatoPrincipal.PlatoPrincipalJaponesa;

public class RestauranteJaponesF implements RestauranteAF{
    @Override
    public Bebida crearBebida() {
        return new BebidaJaponesa();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalJaponesa();
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaJaponesa();
    }
}
