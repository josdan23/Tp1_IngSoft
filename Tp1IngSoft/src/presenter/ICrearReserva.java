package presenter;

import java.util.ArrayList;
import model.Butaca;
import model.Paquete;
import model.Salida;

/**
 *
 * @author Pablo Fernández
 */
public interface ICrearReserva {

    void cargarPaquetes(ArrayList<Paquete> paquetes);

    String obtenerPaqueteSeleccionado();

    void cargarSalidas(ArrayList<Salida> salidas);

    String obtenerSalidaSeleccionada();

    void cargarButacas(ArrayList<Butaca> butacas);

    String obtenerNombre();

    long obtenerDni();

    String obtenerTelefono();

    String obtenerCorreo();

    void mostrarAlerta(String msj, String title, String tipo);

}
