import Creator.EnvioCreator;
import Creator.EstandarCreator;
import Creator.InterCreator;
import Modelos.PedidoEnvio;
import Productos.Envio;

public class Main {
    static void main() {
        PedidoEnvio pedido1 = new PedidoEnvio("Raul","Av. La molina",60.0,160.00);

        EnvioCreator factory;
        factory = new InterCreator();
        factory.gestionarPedido(pedido1);
        System.out.println("------------------------");
        factory= new EstandarCreator();
        factory.gestionarPedido(pedido1);



    }
}
