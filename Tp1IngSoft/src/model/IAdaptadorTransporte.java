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
    
    public Unidad[] obtenerUnidad (String codGrupo, int codCiudad);
    
    public Ciudad[] obtenerCiudad (String codGrupo);
    
    public Resultado vicularUnidad (String codGrupo, int nroUnidad);
    
    public Butacas obtenerButacas (String codGrupo, int nroUnidad);
    
    public Resultado reservarButaca (String codGrupo, int nroUnidad, int[] nroButacasReservadas);
            
    
}
