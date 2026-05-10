package Productos;

import Modelos.PedidoEnvio;

public class EstandarEnvio implements Envio {
    @Override
    public void enviar(PedidoEnvio pedido) {
        System.out.println("Enviando por modo Estandar: " + pedido);
    }
}
