package model;

import java.util.ArrayList;

/**
 *
 * @author Fernández Pablo
 */
public class Paquete {

    private String codPaquete;
    private String nombre;
    private String descripcion;
    private String itinerario;
    private String condicionesComerciales;
    private int nroDias;
    private int nroNoches;
    private Ciudad ciudadOrigen;
    private ArrayList<Salida> salidas;
    private ArrayList<Servicio> servicios;

    public Paquete() {
    }

    public Paquete(String codPaquete, String nombre, String descripcion,
            String itinerario, String condicionesComerciales,
            int nroDias, int nroNoches, Ciudad ciudad) {
        this.codPaquete = codPaquete;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.itinerario = itinerario;
        this.condicionesComerciales = condicionesComerciales;
        this.nroDias = nroDias;
        this.nroNoches = nroNoches;
        this.ciudadOrigen = ciudad;
        this.salidas = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    public String getCodPaquete() {
        return codPaquete;
    }

    public void setCodPaquete(String codPaquete) {
        this.codPaquete = codPaquete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getCondicionesComerciales() {
        return condicionesComerciales;
    }

    public void setCondicionesComerciales(String condicionesComerciales) {
        this.condicionesComerciales = condicionesComerciales;
    }

    public int getNroDias() {
        return nroDias;
    }

    public void setNroDias(int nroDias) {
        this.nroDias = nroDias;
    }

    public int getNroNoches() {
        return nroNoches;
    }

    public void setNroNoches(int nroNoches) {
        this.nroNoches = nroNoches;
    }

    public ArrayList<Salida> getSalidas() {
        return salidas;
    }

    public void setSalidas(ArrayList<Salida> salidas) {
        this.salidas = salidas;
    }

    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Salida crearSalida() {
        return new Salida();
    }

    public void agregarSalida(Salida salida) {
    }

    public ArrayList<Salida> obtenerSalidasEnVenta() {
        return new ArrayList<>();
    }

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

}
