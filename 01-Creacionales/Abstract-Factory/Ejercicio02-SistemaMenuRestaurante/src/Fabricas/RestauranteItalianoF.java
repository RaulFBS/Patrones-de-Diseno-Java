package Fabricas;

import Productos.Bebida.Bebida;
import Productos.Bebida.BebidaItaliana;
import Productos.Entrada.Entrada;
import Productos.Entrada.EntradaItaliana;
import Productos.PlatoPrincipal.PlatoPrincipal;
import Productos.PlatoPrincipal.PlatoPrincipalItaliana;

public class RestauranteItalianoF implements RestauranteAF{
    @Override
    public Bebida crearBebida() {
        return new BebidaItaliana();
    }

    @Override
    public PlatoPrincipal crearPlatoPrincipal() {
        return new PlatoPrincipalItaliana();
    }

    @Override
    public Entrada crearEntrada() {
        return new EntradaItaliana();
    }
}
