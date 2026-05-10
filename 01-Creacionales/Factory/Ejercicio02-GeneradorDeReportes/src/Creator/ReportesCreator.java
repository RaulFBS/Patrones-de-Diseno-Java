package Creator;

import Productos.Reporte;

public abstract class ReportesCreator {
    public abstract Reporte crearReporte();
    public void generarReporte(String reporte) {
       Reporte reporteAux = crearReporte();
       reporteAux.generarReporte(reporte);
    }
}
