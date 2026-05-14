import Cliente.Cliente;
import Fabricas.RestauranteAF;
import Fabricas.RestaurantePeruanoF;

public class Main {
    static void main() {
        RestauranteAF fabrica = new RestaurantePeruanoF();

        Cliente cliente = new Cliente(fabrica);
        cliente.crearRestaurante();

    }
}
