package Productos;

import Modelos.PedidoEnvio;

public class ExpressEnvio implements Envio {

    @Override
    public void enviar(PedidoEnvio pedido) {
        System.out.println("Enviando por modo Express: " + pedido);
    }
}
