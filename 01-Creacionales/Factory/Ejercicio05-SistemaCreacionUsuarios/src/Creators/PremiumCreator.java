package Creators;

import Modelos.RegistroUsuario;
import Productos.Cuenta;
import Productos.CuentaPremium;

public class PremiumCreator extends CuentasCreator{
    @Override
    public Cuenta crearCuenta() {
        return new CuentaPremium();
    }

    @Override
    public boolean validarCuenta(RegistroUsuario usuario) {
        return super.validarCuenta(usuario);
    }
}
