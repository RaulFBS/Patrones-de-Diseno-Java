package Cliente;

import Fabricas.AbstractFactory;
import Productos.Boton.Boton;
import Productos.CajaTexto.CajaTexto;
import Productos.Checkbox.CheckBox;

public class Cliente {
    private AbstractFactory factory;
    private Boton boton;
    private CajaTexto cajaTexto;
    private CheckBox checkBox;

    public Cliente(AbstractFactory factory) {
        this.factory = factory;
    }
    public void crearComponenteUI(){
        boton = factory.createBoton();
        checkBox = factory.createCheckBox();
        cajaTexto = factory.createCajaTexto();

        boton.presionar();
        checkBox.marcar();
        cajaTexto.escribir();
    }

}
