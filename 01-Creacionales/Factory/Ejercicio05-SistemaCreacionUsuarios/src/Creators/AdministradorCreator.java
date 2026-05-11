package Creators;

import Modelos.RegistroUsuario;
import Productos.Cuenta;
import Productos.CuentaAdministrador;

public class AdministradorCreator extends CuentasCreator{
    @Override
    public Cuenta crearCuenta() {
    return new CuentaAdministrador();
    }

    @Override
    public boolean validarCuenta(RegistroUsuario usuario) {
        return super.validarCuenta(usuario);

    }
}
