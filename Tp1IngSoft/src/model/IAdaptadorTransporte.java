package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josdan
 */
public interface IAdaptadorTransporte {
    
    public void obtenerUnidad (String codGrupo, int codCiudad);
    
    public void obtenerCiudad (String codGrupo);
    
    public void vicularUnidad (String codGrupo, int nroUnidad);
    
    public void obtenerButacas (String codGrupo, int nroUnidad);
    
    public void reservarButaca (String codGrupo, int nroUnidad, int[] nroButacasReservadas);
            
    
}
