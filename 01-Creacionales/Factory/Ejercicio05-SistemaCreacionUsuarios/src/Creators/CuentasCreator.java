package Creators;

import Modelos.RegistroUsuario;
import Productos.Cuenta;

public abstract class CuentasCreator {
    public abstract Cuenta crearCuenta();
    public void registrarCuenta(RegistroUsuario usuario) {
        if(!validarCuenta(usuario)){
            System.out.println("La cuenta no es valida");
        }
        Cuenta cuenta = crearCuenta();
        cuenta.activarCuenta(usuario);
    }
    public boolean validarCuenta(RegistroUsuario usuario) {
        if (usuario==null) {
            return false;
        }
        if (!usuario.isValid()) {
            return false;
        }
        return true;
    }
}
