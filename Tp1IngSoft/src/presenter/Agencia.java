package presenter;

import java.util.ArrayList;
import java.util.Calendar;
import service.AdaptadorTransporte;
import model.BasePaquete;
import model.Butaca;
import model.CatalogoDePaquete;
import model.CatalogoDePaquetesJson;
import model.Estado;
import model.Paquete;
import model.Reserva;
import model.Salida;
import model.Unidad;
import service.FactoriaServicios;

/**
 *
 * @author Fernández Pablo
 */
public class Agencia {

    private ICrearSalida vistaCrearSalida;
    private ArrayList<Paquete> paquetes;
    /*Esta coleccion hace referencia a las salidas en venta obtenidas durante
      el caso de uso Crear Reserva
     */
    private ArrayList<Salida> salidas;
    private ArrayList<Butaca> butacas;
    private ArrayList<Unidad> unidades;
    /*este atributo sirve para mantener una referncia a la salida creada
     */
    private Salida salida;
    /*usado en los dos casos de uso para referenciar al paquete que se extrae
      de la coleccion de paquetes
     */
    private Paquete paquete;
    private CatalogoDePaquetesJson catalogoPaquetes;
    /*
        Este atributo sirve para obtener el precio del paquete y agregarlo
        a la reserva.
     */
    private ArrayList<BasePaquete> listaDeBasePaquetes;
    private BasePaquete basePaquete;
    private float total;

    public Agencia(ICrearSalida vista) {
        this.paquetes = new ArrayList<>();
        this.salidas = new ArrayList<>();
        this.unidades = new ArrayList<>();
        this.butacas = new ArrayList<>();
        this.catalogoPaquetes = new CatalogoDePaquetesJson();
        this.vistaCrearSalida = vista;
    }

    public void comenzarNuevaSalida() {
        this.paquetes = catalogoPaquetes.obtenerPaquetes();
        this.vistaCrearSalida.cargarPaquetes(paquetes);
    }

    public void seleccionarPaquetes(String codPaquete) {
        for (Paquete p : this.paquetes) {
            if (p.getCodPaquete().equals(codPaquete)) {
                this.paquete = p;
                break;
            }
        }
        if (this.paquete != null) {
            this.salida = paquete.crearSalida();
            this.unidades = FactoriaServicios.
                    getInstancia().
                    getAdaptadorTransporte().
                    obtenerUnidades(paquete.
                            getCiudadOrigen().
                            getCodigo());
            this.vistaCrearSalida.cargarUnidades(this.unidades);
        } else {
            //avisar a la interfaz grafica que no se encontro el paquete
        }

    }

    public void seleccionarUnidad(int nroUnidad) {
        for (Unidad u : this.unidades) {
            if (u.getNroUnidad() == nroUnidad) {
                this.salida.agregarUnidad(u);
            }
        }
    }

    public void ingresarFecha(Calendar fecha) {
        this.salida.setFecha(fecha);
    }

    public void ingresarCupo(int cupo) {
        this.salida.setCupo(cupo);
    }

    public void confirmarSalida() {
        if (FactoriaServicios.
                getInstancia().
                getAdaptadorTransporte().
                vincularUnidad(this.salida.getUnidad().
                        getNroUnidad())) {
            this.salida.generarCodigoSalida();
            this.salida.setEstado(Estado.EnVenta);
            this.paquete.agregarSalida(salida);
            for (Paquete p : paquetes) {
                if (p.getCodPaquete().equals(this.paquete.getCodPaquete())) {
                    this.paquetes.set(this.paquetes.indexOf(p), this.paquete);
                    break;
                }
            }
            this.catalogoPaquetes.almacenarPaquetes(paquetes);
            this.vistaCrearSalida.mostrarAlerta("SALIDA CONFIRMADA!", "INFO");
            System.out.println("Salida Confiramada!");
        } else {
            this.vistaCrearSalida.mostrarAlerta("NO SE PUDO VINCULAR LA UNIDAD", "ERROR");
        }
    }

    //COMENTARIO AGREGADO POR DANIEL
}
