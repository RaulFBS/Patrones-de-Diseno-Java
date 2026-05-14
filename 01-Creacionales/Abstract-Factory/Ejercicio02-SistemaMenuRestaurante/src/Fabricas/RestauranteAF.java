package Fabricas;

import Productos.Bebida.Bebida;
import Productos.Entrada.Entrada;
import Productos.PlatoPrincipal.PlatoPrincipal;

//AF: abstract factory
public interface RestauranteAF {
    Bebida crearBebida();
    PlatoPrincipal crearPlatoPrincipal();
    Entrada crearEntrada();
}
