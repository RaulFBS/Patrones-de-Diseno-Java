package Creators;

import Modelos.RegistroUsuario;
import Productos.Cuenta;

public abstract class CuentasCreator {
    public abstract Cuenta crearCuenta();
    public void registrarCuenta(RegistroUsuario usuario) {
        if(!validarCuenta(usuario)){
            System.out.println("La cuenta no es valida");
            return;
        }
        Cuenta cuenta = crearCuenta();
        cuenta.activarCuenta(usuario);
        cuenta.mostrarPermisos();
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
