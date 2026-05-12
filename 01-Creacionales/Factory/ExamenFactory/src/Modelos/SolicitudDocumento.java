package Modelos;

public class SolicitudDocumento {
    private String nombreEstudiante;
    private String codigoEstudiante;
    private String correo;
    private String carrera;
    private int ciclo;
    private double promedio;
    private boolean matriculado;
    private String motivo;

    public SolicitudDocumento(String nombreEstudiante, String codigoEstudiante, String correo, String carrera, int ciclo, double promedio, boolean matriculado, String motivo) {
        this.nombreEstudiante = nombreEstudiante;
        this.codigoEstudiante = codigoEstudiante;
        this.correo = correo;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.promedio = promedio;
        this.matriculado = matriculado;
        this.motivo = motivo;
    }

    public SolicitudDocumento() {
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isValido() {
        if(nombreEstudiante==null||nombreEstudiante.isEmpty()){
            System.out.println("El nombre de estudiante no debe estar vacio");
            return false;
        }
        if(codigoEstudiante==null||codigoEstudiante.isEmpty()){
            System.out.println("El codigo de estudiante no debe estar vacio");
            return false;
        }
        if (!correo.contains("@")){
            System.out.println("La correo debe contener @ ");
            return false;
        }
        if (carrera==null||carrera.isEmpty()){
            System.out.println("La carrera no debe estar vacio");
            return false;
        }
        if(ciclo<=0){
            System.out.println("La ciclo debe ser mayor a 0");
            return false;
        }
        if(motivo.length()<10){
            System.out.println("La motivo debe tener al menos 10 caracteres");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SolicitudDocumento{" +
                "nombreEstudiante='" + nombreEstudiante + '\'' +
                ", codigoEstudiante='" + codigoEstudiante + '\'' +
                ", correo='" + correo + '\'' +
                ", carrera='" + carrera + '\'' +
                ", ciclo=" + ciclo +
                ", promedio=" + promedio +
                ", matriculado=" + matriculado +
                ", motivo='" + motivo + '\'' +
                '}';
    }
}
