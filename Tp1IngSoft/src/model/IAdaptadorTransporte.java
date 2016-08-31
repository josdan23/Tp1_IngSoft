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
    
    //proporciona las unidades disponibles para una determinada ciudad,
    public ArrayList<Unidad> obtenerUnidad (String codGrupo, int codCiudad);
    
    //obtiene una lista de ciudades  para las cuales se puede solicitar unidades
    public ArrayList<Ciudad> obtenerCiudad (String codGrupo);
    
    //Permite vicncular una unidad a la salida
    public Resultado vicularUnidad (String codGrupo, int nroUnidad);
    
    //obteine una lista de todas las butacas asociadas
    public ArrayList<Butaca> obtenerButacas (String codGrupo, int nroUnidad);
    
    //Permite realizar la reserva de las butacas elegidas
    public Resultado reservarButaca (String codGrupo, int nroUnidad, int[] nroButacasReservadas);
            
    
}
