package Modelos;

public class RegistroUsuario {
    private String nombre;
    private String correo;
    private String password;
    private int edad;
    private double pagoInicial;
    private String ruc;


    public RegistroUsuario(String nombre, String correo, String password, int edad, double pagoInicial, String ruc) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.edad = edad;
        this.pagoInicial = pagoInicial;
        this.ruc = ruc;
    }

    public RegistroUsuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPagoInicial() {
        return pagoInicial;
    }

    public void setPagoInicial(double pagoInicial) {
        this.pagoInicial = pagoInicial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public boolean isValid(){
        if(nombre == null || nombre.isEmpty()){
            System.out.println("El nombre no debe esta vacío.");
        }
        if(correo == null || correo.isEmpty()){
            System.out.println("El correo no debe estar vacío.");
        }
        if(!correo.contains("@")){
            System.out.println("El correo debe contener @.");
        }
        if(password == null || password.length() < 6){
            System.out.println("El password debe contener 6 caracteres.");
        }
        if(edad <13){
            System.out.println("El edad debe ser mayor o igual a 13.");
        }
        return true;
    }
}
