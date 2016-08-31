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
    ArrayList<Unidad> obtenerUnidades (int codCiudad);
    
    //obtiene una lista de ciudades  para las cuales se puede solicitar unidades
    ArrayList<Ciudad> obtenerCiudades ();
    
    //Permite vicncular una unidad a la salida
    boolean vincularUnidad ( int nroUnidad);
    
    //obteine una lista de todas las butacas asociadas
    ArrayList<Butaca> obtenerButacas (int nroUnidad);
    
    //Permite realizar la reserva de las butacas elegidas
    boolean reservarButacas (int nroUnidad, int[] nroButacasReservadas);
    
}
