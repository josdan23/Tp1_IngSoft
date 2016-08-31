package view;

import java.util.ArrayList;
import java.util.Date;
import model.Paquete;
import model.Unidad;

/**
 *
 * @author Fernández Pablo
 */
public interface ICrearSalida {

    void cargarPaquetes(ArrayList<Paquete> paquetes);

    String obtenerPaqueteSeleccionado();

    void cargarUnidades(ArrayList<Unidad> unidades);

    String obtenerUnidadSeleccionado();

    Date obtenerFecha();

    int obtenerCupos();

    void mostrarAlerta(String msj, String tipo);
}
