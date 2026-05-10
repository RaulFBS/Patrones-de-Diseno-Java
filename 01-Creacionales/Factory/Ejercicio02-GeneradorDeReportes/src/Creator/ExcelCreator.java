package Creator;

import Productos.ExcelReporte;
import Productos.Reporte;

public class ExcelCreator extends ReportesCreator{
    @Override
    public Reporte crearReporte() {
        return new ExcelReporte();
    }
}
