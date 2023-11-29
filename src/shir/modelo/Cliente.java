package shir.modelo;

public class Cliente {
    private String nombre;
    private String direccion;
    private int telefono;
    private String pelectronico;

    public Cliente(String nombre, String direccion, int telefono, String pagoe) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pelectronico = pagoe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPelectronico() {
        return pelectronico;
    }

    public void setPelectronico(String pelectronico) {
        this.pelectronico = pelectronico;
    }
}
