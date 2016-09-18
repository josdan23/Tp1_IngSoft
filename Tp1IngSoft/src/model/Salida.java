package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Fernández Pablo
 */
public class Salida {

    private String codSalida;
    private Calendar fecha;
    private int cupo;
    private Estado estado;
    private Unidad unidad;
    private ArrayList<Reserva> reservas;

    public Salida() {
        this.reservas = new ArrayList<>();
    }

    public Salida(String codSalida, Calendar fecha, int cupo, Estado estado, Unidad unidad) {
        this.codSalida = codSalida;
        this.fecha = fecha;
        this.cupo = cupo;
        this.estado = estado;
        this.unidad = unidad;
        this.reservas = new ArrayList<>();
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
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

    public void generarCodigoSalida() {
        this.codSalida = String.valueOf(this.fecha.get(Calendar.DATE))
                + String.valueOf(this.fecha.get(Calendar.MONTH))
                + String.valueOf(this.fecha.get(Calendar.YEAR));
    }

}
