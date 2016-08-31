package presenter;

import java.util.ArrayList;
import java.util.Date;
import model.AdaptadorTransporte;
import model.Butaca;
import model.CatalogoDePaquete;
import model.Paquete;
import model.Reserva;
import model.Salida;
import model.Unidad;

/**
 *
 * @author Fernández Pablo
 */
public class Agencia {

    private ArrayList<Paquete> paquetes;
    /*Esta coleccion hace referencia a las salidas en venta obtenidas durante
      el caso de uso Crear Reserva
     */
    private ArrayList<Salida> salidas;
    private ArrayList<Butaca> butacas;
    private ArrayList<Unidad> unidades;
    /*este atributo sirve para mantener una referncia a la salida creada
      durante los 2 casos de uso
     */
    private Salida salida;
    /*usado en los dos casos de uso para referenciar al paquete que se extrae
      de la coleccion de paquetes
     */
    private Paquete paquete;
    private CatalogoDePaquete catalogoPaquetes;
    /*este atributo sirve para mantener una referncia a la reserva creada durante
      el caso de uso Crear Reserva
     */
    private Reserva reserva;
    private AdaptadorTransporte adaptadorTransporte;

    public Agencia() {
        this.paquetes = new ArrayList<>();
        this.salidas = new ArrayList<>();
        this.unidades = new ArrayList<>();
        this.butacas = new ArrayList<>();
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
            this.butacas = this.adaptadorTransporte.obtenerButacas(this.salida.
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
        if (this.adaptadorTransporte.reservarButacas(this.salida.getUnidad().
                getNroUnidad(), nroDeButacas)) {
            this.salida.agregarReserva(this.reserva);
        } else {
            // avisar a la interfaz grafica que no se pudieron reservas las butacas
        }
    }
    
    //COMENTARIO AGREGADO POR DANIEL

}
