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
        if(!super.validarCuenta(usuario)){
            return false;
        };
        if (usuario.getPagoInicial()<=0){
            System.out.println("El pago inicial debe ser mayor a 0");
            return false;
        }
        return true;
    }
}
