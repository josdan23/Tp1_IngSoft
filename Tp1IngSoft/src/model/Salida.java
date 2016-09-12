package model;

import java.util.ArrayList;
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
    private ArrayList<Reserva> reservas;

    public Salida() {
    }

    public Salida(String codSalida, Date fecha, int cupo, Estado estado, Unidad unidad) {
        this.codSalida = codSalida;
        this.fecha = fecha;
        this.cupo = cupo;
        this.estado = estado;
        this.unidad = unidad;
        this.reservas = new ArrayList<>();
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

    public String getCodSalida() {
        return codSalida;
    }

    public void setCodSalida(String codSalida) {
        this.codSalida = codSalida;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public void agregarUnidad(Unidad unidad) {
        setUnidad(unidad);
    }

    public void agregarReserva(Reserva reserva) {
        getReservas().add(reserva);
    }

}
