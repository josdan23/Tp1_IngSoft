package model;

import java.util.Calendar;

/**
 *
 * @author Fernández Pablo
 */
public class Butaca extends Servicio {

    private int nroButaca;
    private boolean estado;
    private Unidad unidad;

    public Butaca() {
    }

    public Butaca(int nroButaca, boolean estado, Calendar FechaDesde, Calendar FechaHasta, Unidad unidad) {
        super(FechaDesde, FechaHasta);
        this.nroButaca = nroButaca;
        this.estado = estado;
        this.unidad = unidad;
    }

    public int getNroButaca() {
        return nroButaca;
    }

    public void setNroButaca(int nroButaca) {
        this.nroButaca = nroButaca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

}
