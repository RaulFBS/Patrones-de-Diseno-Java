package Creator;

import Productos.Envio;
import Productos.ExpressEnvio;
import Productos.RecojoEnvio;

public class RecojoCreator extends EnvioCreator {
    @Override
    public Envio crearEnvio() {
        return new RecojoEnvio();
    }
}
