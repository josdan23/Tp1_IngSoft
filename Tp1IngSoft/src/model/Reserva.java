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
    private float total;
    private Salida salida;

    public Reserva() {
        this.butacas = new ArrayList<>();
    }

    public Reserva(int cantPasajeros, Cliente cliente, float total, Salida salida) {
        this.cantPasajeros = cantPasajeros;
        this.cliente = cliente;
        this.butacas = new ArrayList<>();
        this.total = total;
        this.salida = salida;
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

    public void setButacas(ArrayList<Butaca> butacas) {
        this.butacas = butacas;
    }

    public ArrayList<Butaca> getButacas() {
        return butacas;
    }

    public void agregarButaca(Butaca butaca) {
        this.butacas.add(butaca);
    }

    //obtiene el nro de butacas que estan reservadas
    public int[] obtenerButacas() {
        int butacas[] = new int[this.getCantPasajeros()];

        for (int i = 0; i < butacas.length; i++) {
            butacas[i] = this.getButacas().get(i).getNroButaca();
        }
        return butacas;
    }

    public void agregarSalida(Salida salida) {
        this.setSalida(salida);
    }

    public void ingresarCliente(String nombre, long dni, String telefono,
            String correo) {

        this.setCliente(new Cliente(nombre, dni, telefono, correo));
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Salida getSalida() {
        return salida;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

}
