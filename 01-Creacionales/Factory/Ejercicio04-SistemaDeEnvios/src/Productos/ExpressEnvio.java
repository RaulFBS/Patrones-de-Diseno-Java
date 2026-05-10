package Productos;

import Modelos.PedidoEnvio;

public class ExpressEnvio implements Envio {

    @Override
    public void enviar(PedidoEnvio pedido) {
        System.out.println("Procesando modo Express: ");
        System.out.println("\n"+pedido.toString());
    }
}
