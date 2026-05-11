package Productos;

import Modelos.RegistroUsuario;

public interface Cuenta {
    void activarCuenta(RegistroUsuario usuario);
    void mostrarPermisos();
}
