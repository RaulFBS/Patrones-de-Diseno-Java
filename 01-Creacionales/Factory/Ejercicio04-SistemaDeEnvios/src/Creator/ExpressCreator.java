package Creator;

import Productos.Envio;
import Productos.EstandarEnvio;
import Productos.ExpressEnvio;

public class ExpressCreator extends EnvioCreator{
    @Override
    public Envio crearEnvio() {
        return new ExpressEnvio();
    }
}
