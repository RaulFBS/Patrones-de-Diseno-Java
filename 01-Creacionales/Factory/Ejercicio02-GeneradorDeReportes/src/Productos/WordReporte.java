package Productos;

public class WordReporte implements Reporte{

    @Override
    public void generarReporte(String reporte) {
        System.out.println("Reporte Generado en Word: "+reporte);
    }
}
