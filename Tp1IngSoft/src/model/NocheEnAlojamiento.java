package model;

import java.util.Calendar;

/**
 *
 * @author josdan
 */
public class NocheEnAlojamiento extends Servicio {

    private int cantEstrella;

    public NocheEnAlojamiento(Calendar fechaDesde, Calendar fechaHasta, int cantEstrella) {
        super(fechaDesde, fechaHasta);
        this.cantEstrella = cantEstrella;
    }

    public int getCantEstrella() {
        return cantEstrella;
    }

    public void setCantEstrella(int cantEstrella) {
        this.cantEstrella = cantEstrella;
    }

}
