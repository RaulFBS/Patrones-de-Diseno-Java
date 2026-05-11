package Productos;

import Modelos.RegistroUsuario;

public class CuentaAdministrador implements Cuenta {
    @Override
    public void activarCuenta(RegistroUsuario usuario) {
        System.out.println("Activando Cuenta Administrador");
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Mostrando Permisos");
    }
}
