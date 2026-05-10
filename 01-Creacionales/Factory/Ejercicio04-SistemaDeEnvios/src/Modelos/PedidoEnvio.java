package Modelos;

public class PedidoEnvio {
    private String cliente;
    private String direccion;
    private double pegoKg;
    private double costoProducto;

    public PedidoEnvio(String cliente, String direccion, double pegoKg, double costoProducto) {
        this.cliente = cliente;
        this.direccion = direccion;
        this.pegoKg = pegoKg;
        this.costoProducto = costoProducto;
    }

    public PedidoEnvio() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPegoKg() {
        return pegoKg;
    }

    public void setPegoKg(double pegoKg) {
        this.pegoKg = pegoKg;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }
}
