package model;

import java.util.Calendar;

/**
 *
 * @author Fernández Pablo
 */
public class Servicio {

    private Calendar FechaDesde;
    private Calendar FechaHasta;

    public Servicio() {
    }

    public Servicio(Calendar FechaDesde, Calendar FechaHasta) {
        this.FechaDesde = FechaDesde;
        this.FechaHasta = FechaHasta;
    }

    public Calendar getFechaDesde() {
        return FechaDesde;
    }

    public void setFechaDesde(Calendar FechaDesde) {
        this.FechaDesde = FechaDesde;
    }

    public Calendar getFechaHasta() {
        return FechaHasta;
    }

    public void setFechaHasta(Calendar FechaHasta) {
        this.FechaHasta = FechaHasta;
    }

}
