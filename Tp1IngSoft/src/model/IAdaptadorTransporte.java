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
import java.util.ArrayList;

public interface IAdaptadorTransporte {
    
    //proporciona las unidades disponibles para una determinada ciudad,
    ArrayList<Unidad> obtenerUnidades (String codGrupo, int codCiudad);
    
    //obtiene una lista de ciudades  para las cuales se puede solicitar unidades
    ArrayList<Ciudad> obtenerCiudades (String codGrupo);
    
    //Permite vicncular una unidad a la salida
    Resultado vicularUnidad (String codGrupo, int nroUnidad);
    
    //obteine una lista de todas las butacas asociadas
    ArrayList<Butaca> obtenerButacas (String codGrupo, int nroUnidad);
    
    //Permite realizar la reserva de las butacas elegidas
    Resultado reservarButaca (String codGrupo, int nroUnidad, int[] nroButacasReservadas);
    
}
