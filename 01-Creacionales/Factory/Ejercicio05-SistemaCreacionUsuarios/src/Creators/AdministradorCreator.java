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
        if (!super.validarCuenta(usuario)){
            return  false;
        }
        if(!usuario.getCorreo().endsWith("@empresa.com")){
            System.out.println("El correo debe terminar en @empresa.com");
            return false;
        }
        return true;
    }
}
