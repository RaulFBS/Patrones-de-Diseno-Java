package Modelos;

public class SolicitudTicket
{
    private String cliente;
    private String correo;
    private String descripcion;
    private String codigoPedido;
    private String categoria;
    private int nivelUrgencia;
    private boolean clientePremium;


    public SolicitudTicket(String cliente, String correo, String descripcion, String codigoPedido, String categoria, int nivelUrgencia, boolean clientePremium) {
        this.cliente = cliente;
        this.correo = correo;
        this.descripcion = descripcion;
        this.codigoPedido = codigoPedido;
        this.categoria = categoria;
        this.nivelUrgencia = nivelUrgencia;
        this.clientePremium = clientePremium;
    }

    public SolicitudTicket() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(int nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public boolean isClientePremium() {
        return clientePremium;
    }

    public void setClientePremium(boolean clientePremium) {
        this.clientePremium = clientePremium;
    }

    public boolean isValido() {
        if(cliente == null || cliente.isEmpty()){
            System.out.println("El cliente no puede estar vacio");
            return false;
        }
        if(correo == null || correo.isEmpty()){
            System.out.println("El correo no puede estar vacio");
            return false;
        }
        if(!correo.contains("@")){
            System.out.println("El correo debe contener @");
            return false;
        }
        if(descripcion.length()<10){
            System.out.println("El descripcion debe tener al menos 10 caracteres");
            return false;
        }
        if(nivelUrgencia<0 || nivelUrgencia>6){
            System.out.println("El nivel de Urgencia debe estar entre 1 y 6");
            return false;
        }
        return true;
    }
}
