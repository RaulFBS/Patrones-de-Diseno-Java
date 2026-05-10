package Creator;

import Productos.Reporte;

public abstract class ReportesCreator {
    public abstract Reporte crearReporte(String reporte);
    public void generarReporte(String reporte) {
       Reporte reporteAux = crearReporte(reporte);
       reporteAux.generarReporte(reporte);
    }
}
