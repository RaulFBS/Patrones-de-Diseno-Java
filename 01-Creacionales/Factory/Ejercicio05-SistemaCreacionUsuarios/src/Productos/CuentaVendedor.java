package Productos;

import Modelos.RegistroUsuario;

public class CuentaVendedor implements Cuenta {
    @Override
    public void activarCuenta(RegistroUsuario usuario) {
        System.out.println("Activando Cuenta Vendedor");
    }

    @Override
    public void mostrarPermisos() {
        System.out.println("Mostrando Permisos");
    }
}
