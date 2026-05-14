package Fabricas;

import Productos.Bebida.Bebida;
import Productos.Bebida.BebidaPeruana;
import Productos.Entrada.Entrada;
import Productos.Entrada.EntradaPeruana;
import Productos.PlatoPrincipal.PlatoPrincipal;
import Productos.PlatoPrincipal.PlatoPrincipalPeruana;

public class RestaurantePeruanoF implements RestauranteAF{
    @Override
    public Bebida crearBebida() {
        return new BebidaPeruana();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalPeruana();
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaPeruana();
    }
}
