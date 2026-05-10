package Creator;

import Productos.Envio;
import Productos.EstandarEnvio;

public class EstandarCreator extends EnvioCreator{
    @Override
    public Envio crearEnvio() {
        return new EstandarEnvio();
    }
}
