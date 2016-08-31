/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author josdan
 */
public class NocheEnAlojamiento extends Servicio{
    
    private int cantEstrella;
    
    public NocheEnAlojamiento (Date fechaDesde, Date fechaHasta, int cantEstrella) {
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
