package Creators;

import Modelos.RegistroUsuario;
import Productos.Cuenta;
import Productos.CuentaBasica;

public class BasicaCreator extends CuentasCreator{
    @Override
    public Cuenta crearCuenta() {
        return new CuentaBasica();
    }

    @Override
    public boolean validarCuenta(RegistroUsuario usuario) {
        return super.validarCuenta(usuario);
    }
}
