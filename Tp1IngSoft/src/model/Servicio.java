package model;

import java.util.Date;

/**
 *
 * @author Fernández Pablo
 */
public class Servicio {

    private Date FechaDesde;
    private Date FechaHasta;

    public Servicio() {
    }

    public Servicio(Date FechaDesde, Date FechaHasta) {
        this.FechaDesde = FechaDesde;
        this.FechaHasta = FechaHasta;
    }

    public Date getFechaDesde() {
        return FechaDesde;
    }

    public void setFechaDesde(Date FechaDesde) {
        this.FechaDesde = FechaDesde;
    }

    public Date getFechaHasta() {
        return FechaHasta;
    }

    public void setFechaHasta(Date FechaHasta) {
        this.FechaHasta = FechaHasta;
    }
    
    

}
