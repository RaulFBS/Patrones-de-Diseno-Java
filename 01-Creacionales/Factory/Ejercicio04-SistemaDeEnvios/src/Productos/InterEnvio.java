package Productos;

import Modelos.PedidoEnvio;

public class InterEnvio implements Envio {
    @Override
    public void enviar(PedidoEnvio pedido) {
        System.out.println("Envio internacional: " + pedido);
    }
}
