package Productos;

public abstract class Vehiculo {
    protected String modelo;
    protected String tipoEnergia;
    protected int velocidadMaxima;

    public Vehiculo(String modelo, String tipoEnergia, int velocidadMaxima) {
        this.modelo = modelo;
        this.tipoEnergia = tipoEnergia;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDatos(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo Energia: " + tipoEnergia);
        System.out.println("Velocidad Maxima: " + velocidadMaxima + "Km/h");
    }
}
