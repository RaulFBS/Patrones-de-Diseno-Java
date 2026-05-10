package Creator;

import Modelos.PedidoEnvio;
import Productos.Envio;

public abstract class EnvioCreator {
    public abstract Envio crearEnvio();

    public void gestionarPedido(PedidoEnvio pedido) {
        if (validarPedido(pedido)) {
            System.out.println("El pedido del envio no es valido");
        }
        Envio envio = crearEnvio();
        envio.enviar(pedido);
    }
    public boolean validarPedido(PedidoEnvio pedido) {
       if(pedido == null){
           return false;
       }
       if(!pedido.isvalido()){
           return false;
       }
       return true;
    }
}
