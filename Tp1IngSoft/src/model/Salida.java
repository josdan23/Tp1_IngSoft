package model;

import java.util.Date;

/**
 *
 * @author Fernández Pablo
 */
public class Salida {

    private String codSalida;
    private Date fecha;
    private int cupo;
    private Estado estado;
    private Unidad unidad;

    public Salida() {
    }

    public Salida(Date fecha, int cupo, Estado estado, Unidad unidad) {
        this.fecha = fecha;
        this.cupo = cupo;
        this.estado = estado;
        this.unidad = unidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

    public void agregarUnidad(Unidad unidad) {
    }

    public void agregarReserva(Reserva reserva) {
    }
}
