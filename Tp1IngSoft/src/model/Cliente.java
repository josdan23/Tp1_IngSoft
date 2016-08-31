package model;

/**
 *
 * @author Pablo Fernández
 */
public class Cliente {

    private String nombre;
    private long dni;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String nombre, long dni, String telefono, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
}
