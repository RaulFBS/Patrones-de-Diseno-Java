package Creators;

import Modelos.RegistroUsuario;
import Productos.Cuenta;
import Productos.CuentaVendedor;

public class VendedorCreator extends CuentasCreator{
    @Override
    public Cuenta crearCuenta() {
        return new CuentaVendedor();
    }

    @Override
    public boolean validarCuenta(RegistroUsuario usuario) {
        return super.validarCuenta(usuario);
    }
}
