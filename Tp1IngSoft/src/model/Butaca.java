package model;

import java.util.Date;

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

    public Butaca(int nroButaca, boolean estado, Unidad unidad, Date FechaDesde, Date FechaHasta) {
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
