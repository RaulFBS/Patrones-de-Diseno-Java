package Creator;

import Modelos.PedidoEnvio;
import Productos.Envio;

import Productos.InterEnvio;

public class InterCreator extends EnvioCreator{
    @Override
    public Envio crearEnvio() {

        return new InterEnvio();
    }

    @Override
    public boolean validarPedido(PedidoEnvio pedido) {
        if(!validarPedido(pedido)){
        return false;}
        if(pedido.getPegoKg()>30){
            System.out.println("El peso del envio internacional no puede superar los 30kg");
        return false;}
        return true;

    }
}
