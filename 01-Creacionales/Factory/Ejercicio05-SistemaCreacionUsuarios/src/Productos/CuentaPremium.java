package Productos;

import Modelos.RegistroUsuario;

public class CuentaPremium implements Cuenta {
    @Override
    public void activarCuenta(RegistroUsuario usuario) {
        System.out.println("Activando Cuenta Premium");
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Mostrando Permisos");

    }
}
