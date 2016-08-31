package model;

import java.util.ArrayList;

/**
 *
 * @author Fernández Pablo
 */
public class Reserva {

    private int cantPasajeros;
    private Cliente cliente;
    private ArrayList<Butaca> butacas;

    public Reserva() {
    }

    public Reserva(int cantPasajeros, Cliente cliente) {
        this.cantPasajeros = cantPasajeros;
        this.cliente = cliente;
        this.butacas = new ArrayList<>();
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarButaca(Butaca butaca) {

    }

    public int[] obtenerButacas() {
        int butacas[] = new int[this.getCantPasajeros()];
        
        for( Butaca b : )
        return null;
    }

    public void agregarSalida(Salida salida) {
    }

    public void ingresarCliente(String nombre, long dni, String telefono,
            String correo) {
        
        this.setCliente(new Cliente(nombre, dni, telefono, correo));
    }

}
