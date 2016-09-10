/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presenter;

import java.util.ArrayList;
import model.BasePaquete;
import model.Butaca;
import model.CatalogoDePaquete;
import model.Paquete;
import model.Reserva;
import model.Salida;
import service.FactoriaServicios;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CrearReservaPresenter {

    private Reserva reserva;
    private Salida salida;
    private Paquete paquete;
    private BasePaquete basePaquete;
    private ArrayList<Paquete> paquetes;
    private ArrayList<Salida> salidas;
    private ArrayList<Butaca> butacas;
    private CatalogoDePaquete catalogoPaquetes;

    public void crearReserva() {
        this.reserva = new Reserva();
        this.paquetes = catalogoPaquetes.obtenerPaquetes();
    }

    public void seleccionarPaquetesReserva(String codPaquete) {
        for (Paquete p : this.paquetes) {
            if (p.getCodPaquete().equals(codPaquete)) {
                this.paquete = p;
                break;
            }
        }
        if (this.paquete != null) {
            this.salidas = this.paquete.obtenerSalidasEnVenta();
        } else {
            //avisar a la interfaz grafica que no se encontro el paquete
        }
    }

    public void seleccionarSalida(String codSalida) {
        for (Salida s : this.salidas) {
            if (s.getCodSalida().equals(codSalida)) {
                this.salida = s;
                break;
            }
        }
        if (this.salida != null) {
            this.reserva.agregarSalida(this.salida);
            this.butacas = FactoriaServicios.
                    getInstancia().
                    getAdaptadorTransporte().
                    obtenerButacas(this.salida.
                            getUnidad().getNroUnidad());
        } else {
            //avisar a la interfaz grafica que no se encontro la salida
        }
    }

    public void ingresarCantPasajeros(int cantPasajeros) {
        ArrayList<Butaca> butacasDisp = new ArrayList<>();
        for (Butaca b : butacas) {
            //si el estado de la butaca es true esta ocupado
            if (!b.isEstado()) {
                butacasDisp.add(b);
            }
        }
        if (butacasDisp.size() >= cantPasajeros) {
            this.reserva.setCantPasajeros(cantPasajeros);
        }

        //ATENCION! FALTA CALCULAR EL TOTAL DE LA RESERVA
        this.basePaquete = this.paquete.getListaBasePaquetes().get(cantPasajeros - 1);

        this.reserva.setTotal(this.basePaquete.getPrecio());
    }

    public void seleccionarButaca(int nroButaca) {
        for (Butaca b : this.butacas) {
            if (b.getNroButaca() == nroButaca && !b.isEstado()) {
                this.reserva.agregarButaca(b);
            }
        }
    }

    public void ingresarCliente(String nombre, long dni, String telefono,
            String correo) {
        this.reserva.ingresarCliente(nombre, dni, telefono, correo);
    }

    public void confirmarReserva() {
        int[] nroDeButacas = this.reserva.obtenerButacas();
        if (FactoriaServicios.
                getInstancia().
                getAdaptadorTransporte().
                reservarButacas(this.salida.getUnidad().
                        getNroUnidad(), nroDeButacas)) {
            this.salida.agregarReserva(this.reserva);
        } else {
            // avisar a la interfaz grafica que no se pudieron reservas las butacas
        }
    }

}
