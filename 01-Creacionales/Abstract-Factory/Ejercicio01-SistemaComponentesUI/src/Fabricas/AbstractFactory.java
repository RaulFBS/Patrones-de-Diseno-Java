package Fabricas;

import Productos.Boton.Boton;
import Productos.CajaTexto.CajaTexto;
import Productos.Checkbox.CheckBox;

public interface AbstractFactory {
    Boton createBoton();
    CheckBox createCheckBox();
    CajaTexto createCajaTexto();

}
