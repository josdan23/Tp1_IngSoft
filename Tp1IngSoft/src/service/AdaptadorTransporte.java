/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import service.IAdaptadorTransporte;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Butaca;
import model.Ciudad;
import model.Unidad;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfButacaSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfCiudadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.ArrayOfUnidadSvc;
import org.datacontract.schemas._2004._07.sge_service_contracts.Resultado;
import org.tempuri.IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage;
import org.tempuri.IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage;
import org.tempuri.IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage;
import org.tempuri.IBusServiceReservarButacasBusServiceFaultFaultFaultMessage;
import org.tempuri.IBusServiceVincularUnidadBusServiceFaultFaultFaultMessage;

/**
 *
 * @author josdan
 */
public class AdaptadorTransporte implements IAdaptadorTransporte {

    //codigo de grupo asignado
    final static String CODIGO_GRUPO = "5e17e947-2fa9-446f-89c0-a1257b3069b8";

    @Override
    public ArrayList<Unidad> obtenerUnidades(int codCiudad) {

        ArrayList<Unidad> listaUnidades = new ArrayList<Unidad>();

        try {

            ArrayOfUnidadSvc unidadesSvc = obtenerUnidades_1(CODIGO_GRUPO, codCiudad);
            for (int i = 0; i < unidadesSvc.getUnidadSvc().size(); i++) {
                Unidad unidadActual = new Unidad();
                //crear una unidad
                unidadActual.setNroUnidad(unidadesSvc.getUnidadSvc().get(i).getNumero().intValue());
                unidadActual.setCantAsientos(unidadesSvc.getUnidadSvc().get(i).getCantidadButacas().intValue());
                unidadActual.setDominio(unidadesSvc.getUnidadSvc().get(i).getDominio().getValue());
                unidadActual.setMarca(unidadesSvc.getUnidadSvc().get(i).getMarca().getValue());
                unidadActual.setTipo(unidadesSvc.getUnidadSvc().get(i).getTipo().getValue());
                  
                //agregar unidad a la lista
                listaUnidades.add(unidadActual);
            }

        } catch (IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage ex) {
            Logger.getLogger(AdaptadorTransporte.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

        return listaUnidades;
    }

    @Override
    public ArrayList<Ciudad> obtenerCiudades() {

        ArrayList<Ciudad> listaCiudades = new ArrayList<Ciudad>();

        try {

            ArrayOfCiudadSvc ciudadesSvc = obtenerCiudades_1(CODIGO_GRUPO);

            Ciudad ciudad = new Ciudad();

            for (int i = 0; i < ciudadesSvc.getCiudadSvc().size(); i++) {
                ciudad.setCodigo(ciudadesSvc.getCiudadSvc().get(i).getCodigo().intValue());
                ciudad.setDescripcion(ciudadesSvc.getCiudadSvc().get(i).getDescripcion().getValue());

                listaCiudades.add(ciudad);
            }
        } catch (IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage ex) {
            Logger.getLogger(AdaptadorTransporte.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

        return listaCiudades;
    }

    @Override
    public boolean vincularUnidad(int nroUnidad) {

        boolean resultado = false;

        try {
            resultado = vincularUnidad_1(CODIGO_GRUPO, nroUnidad).isCorrecto();

        } catch (IBusServiceVincularUnidadBusServiceFaultFaultFaultMessage ex) {
            Logger.getLogger(AdaptadorTransporte.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return resultado;
        }

    }

    @Override
    public ArrayList<Butaca> obtenerButacas(int nroUnidad) {

        ArrayList<Butaca> listaButacas = new ArrayList<Butaca>();

        try {

            ArrayOfButacaSvc butacasSvc = obtenerButacas_1(CODIGO_GRUPO, nroUnidad);

            Butaca butaca = new Butaca();

            for (int i = 0; i < butacasSvc.getButacaSvc().size(); i++) {
                butaca.setNroButaca(butacasSvc.getButacaSvc().get(i).getNumero().intValue());
                butaca.setEstado(butacasSvc.getButacaSvc().get(i).isOcupada());

                listaButacas.add(butaca);
            }
        } catch (IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage ex) {
            Logger.getLogger(AdaptadorTransporte.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return listaButacas;
    }

    @Override
    public boolean reservarButacas(int nroUnidad, int[] nroButacasReservadas) {
        boolean resultado = false;

        ArrayOfint o = new ArrayOfint();

        for (int nroButaca : nroButacasReservadas) {
            o.getInt().add(nroButaca);
        }

        try {
            resultado = reservarButacas_1(CODIGO_GRUPO, nroUnidad, o).isCorrecto();

        } catch (IBusServiceReservarButacasBusServiceFaultFaultFaultMessage ex) {
            Logger.getLogger(AdaptadorTransporte.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return resultado;
        }
    }

    //METODOS QUE PROPORCIONA LA API
    private static ArrayOfUnidadSvc obtenerUnidades_1(java.lang.String codigo, java.lang.Integer ciudad) throws IBusServiceObtenerUnidadesBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.obtenerUnidades(codigo, ciudad);
    }

    private static ArrayOfButacaSvc obtenerButacas_1(java.lang.String codigo, java.lang.Integer unidad) throws IBusServiceObtenerButacasBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.obtenerButacas(codigo, unidad);
    }

    private static ArrayOfCiudadSvc obtenerCiudades_1(java.lang.String codigo) throws IBusServiceObtenerCiudadesBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.obtenerCiudades(codigo);
    }

    private static Resultado reservarButacas_1(java.lang.String codigo, java.lang.Integer unidad, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint butacas) throws IBusServiceReservarButacasBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.reservarButacas(codigo, unidad, butacas);
    }

    private static Resultado vincularUnidad_1(java.lang.String codigo, java.lang.Integer unidad) throws IBusServiceVincularUnidadBusServiceFaultFaultFaultMessage {
        org.tempuri.BusService service = new org.tempuri.BusService();
        org.tempuri.IBusService port = service.getSGEBusService();
        return port.vincularUnidad(codigo, unidad);
    }

}
