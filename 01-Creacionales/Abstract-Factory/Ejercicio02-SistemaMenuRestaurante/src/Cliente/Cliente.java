package Cliente;

import Fabricas.RestauranteAF;

import Productos.Bebida.Bebida;
import Productos.Entrada.Entrada;
import Productos.PlatoPrincipal.PlatoPrincipal;


public class Cliente {
    private RestauranteAF fabrica;
    private Entrada entrada;
    private PlatoPrincipal platoPrincipal;
    private Bebida bebida;
    public Cliente(RestauranteAF fabrica) {
        this.fabrica = fabrica;
    }

    public void crearRestaurante() {
        entrada = fabrica.crearEntrada();
        platoPrincipal = fabrica.crearPlatoPrincipal();
        bebida = fabrica.crearBebida();

        entrada.mostrar();
        platoPrincipal.mostrar();
        bebida.mostrar();
    }
}
