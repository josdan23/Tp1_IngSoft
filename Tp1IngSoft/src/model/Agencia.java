package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fernández Pablo
 */
public class Agencia {

    private ArrayList<Paquete> paquetes;
    private ArrayList<Salida> salidas;
    private ArrayList<Unidad> unidades;
    /*este atributo sirve para mantener una referncia a la salida creada
      durante el caso de uso Crear Salida
     */
    private Salida salida;
    /*este atributo sirve para mantener una referncia al paquete extraido de la
      coleccion de paquetes durante el caso de uso Crear Salida
     */
    private Paquete paquete;
    private CatalogoDePaquete catalogoPaquetes;
    private Reserva reserva;
    private AdaptadorTransporte adaptadorTransporte;

    public Agencia() {
        this.paquetes = new ArrayList<>();
        this.salidas = new ArrayList<>();
        this.unidades = new ArrayList<>();
        this.catalogoPaquetes = new CatalogoDePaquete();
        this.adaptadorTransporte = new AdaptadorTransporte();
    }

    public void comenzarNuevaSalida() {
        this.paquetes = catalogoPaquetes.obtenerPaquetes();
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
            this.unidades = this.adaptadorTransporte.obtenerUnidades(paquete.
                    getCiudadOrigen().getCodigo());
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

    public void ingresarFecha(Date fecha) {
        this.salida.setFecha(fecha);
    }

    public void ingresarCupo(int cupo) {
        this.salida.setCupo(cupo);
    }

    public void confirmarSalida() {
        if (this.adaptadorTransporte.vincularUnidad(this.salida.getUnidad().
                getNroUnidad())) {
            this.paquete.agregarSalida(salida);
        } else {
            // avisar a la interfaz que no se pudo vincular la salida con la unidad
        }
    }

    public void crearReserva() {
    }

    public void seleccionarSalida(String codSalida) {
    }

    public void ingresarCantPasajeros(int cantPasajeros) {
    }

    public void seleccionarButaca(int nroButaca) {
    }

    public void confirmarReserva() {
    }

    public void ingresarCliente(String nombre, long dni, String telefono,
            String correo) {
    }

}
