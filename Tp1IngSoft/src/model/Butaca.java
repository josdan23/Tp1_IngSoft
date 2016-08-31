package model;

import java.util.Date;

/**
 *
 * @author Fernández Pablo
 */
public class Butaca extends Servicio {

    private int nroButaca;
    private boolean estado;

    public Butaca() {
    }

    public Butaca(int nroButaca, boolean estado, Date FechaDesde, Date FechaHasta) {
        super(FechaDesde, FechaHasta);
        this.nroButaca = nroButaca;
        this.estado = estado;
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
    
}
