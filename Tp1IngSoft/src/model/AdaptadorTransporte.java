/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfButacaSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfUnidadSvc;
import org.tempuri.IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage;
import org.tempuri.IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage;

/**
 *
 * @author josdan
 */
public class AdaptadorTransporte implements IAdaptadorTransporte {

    @Override
    public ArrayList<Unidad> obtenerUnidades(String codGrupo, int codCiudad) {

        ArrayList<Unidad> listaUnidades = new ArrayList<Unidad>();

        try {
            ArrayOfUnidadSvc unidadesSvc = obtenerUnidades_1(codGrupo, codCiudad);

            Unidad unidadActual = new Unidad();
            for (int i = 0; i < unidadesSvc.getUnidadSvc().size(); i++) {

                //crear una unidad
                unidadActual.setNroUnidad(unidadesSvc.getUnidadSvc().get(i).getNumero().intValue());
                unidadActual.setCantAsientos(unidadesSvc.getUnidadSvc().get(i).getCantidadButacas().intValue());
                unidadActual.setDominio(unidadesSvc.getUnidadSvc().get(i).getDominio().getValue());

                //agregar unidad a la lista
                listaUnidades.add(unidadActual);
            }

        } catch (IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage ex) {
            Logger.getLogger(AdaptadorTransporte.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaUnidades;
    }

    @Override
    public ArrayList<Ciudad> obtenerCiudades(String codGrupo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Resultado vicularUnidad(String codGrupo, int nroUnidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Butaca> obtenerButacas(String codGrupo, int nroUnidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Resultado reservarButaca(String codGrupo, int nroUnidad, int[] nroButacasReservadas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //METODOS QUE PROPORCIONA LA API
    private static ArrayOfUnidadSvc obtenerUnidades_1(java.lang.String codigo, java.lang.Integer ciudad) throws IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.obtenerUnidades(codigo, ciudad);
    }

}
