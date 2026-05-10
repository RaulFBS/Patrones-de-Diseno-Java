package Productos;

import Modelos.PedidoEnvio;

public class RecojoEnvio implements Envio {
    @Override
    public void enviar(PedidoEnvio pedido) {
        System.out.println("Envio por Recojo en tienda: ");
        System.out.println(pedido);
    }
}
