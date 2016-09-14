package model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author josdan
 */
public class CatalogoDePaquete {

    public ArrayList<Paquete> obtenerPaquetes() {

        ArrayList<Paquete> listaPaquetes = new ArrayList<Paquete>();
        ArrayList<BasePaquete> listaBasePaquetes = new ArrayList<BasePaquete>();

        listaBasePaquetes.add(new BasePaquete("Simple", 1500));
        listaBasePaquetes.add(new BasePaquete("Doble", 2000));
        listaBasePaquetes.add(new BasePaquete("Triple", 2700));
        listaBasePaquetes.add(new BasePaquete("Cuadruple", 3200));
        listaBasePaquetes.add(new BasePaquete("Quintuple", 3750));

        Paquete p1 = new Paquete("p1", "paqA", "xxxx", "xxxx", " xxxx", 2, 3,
                new Ciudad(1, "xxxx"), listaBasePaquetes);

        ArrayList<Salida> salidas = new ArrayList<>();
        salidas.add(new Salida("xyxyx", Calendar.getInstance(), 20, Estado.EnVenta,
                new Unidad(1, 44, "AXA112", "SCANIA", "CAMA")));
        salidas.add(new Salida("zzzzwwz", Calendar.getInstance(), 20, Estado.EnEjecucion,
                new Unidad(1, 44, "AXA112", "SCANIA", "CAMA")));
        salidas.add(new Salida("abcbac", Calendar.getInstance(), 20, Estado.EnVenta,
                new Unidad(1, 44, "AXA112", "SCANIA", "CAMA")));
        p1.setSalidas(salidas);

        listaPaquetes.add(p1);

        listaBasePaquetes.clear();
        listaBasePaquetes.add(new BasePaquete("Simple", 2500));
        listaBasePaquetes.add(new BasePaquete("Doble", 3000));
        listaBasePaquetes.add(new BasePaquete("Triple", 3700));
        listaBasePaquetes.add(new BasePaquete("Cuadruple", 3200));
        listaBasePaquetes.add(new BasePaquete("Quintuple", 4750));

        listaPaquetes.add(new Paquete("p2", "paqB", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(2, "xxxx"), listaBasePaquetes));

        listaBasePaquetes.clear();
        listaBasePaquetes.add(new BasePaquete("Simple", 2500));
        listaBasePaquetes.add(new BasePaquete("Doble", 3000));
        listaBasePaquetes.add(new BasePaquete("Triple", 3700));
        listaBasePaquetes.add(new BasePaquete("Cuadruple", 3200));
        listaBasePaquetes.add(new BasePaquete("Quintuple", 4750));

        listaPaquetes.add(new Paquete("p3", "paqC", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(3, "xxxx"), listaBasePaquetes));
        listaPaquetes.add(new Paquete("p4", "paqD", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(4, "xxxx"), listaBasePaquetes));
        listaPaquetes.add(new Paquete("p5", "paqE", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(5, "xxxx"), listaBasePaquetes));
        listaPaquetes.add(new Paquete("p6", "paqF", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(3, "xxxx"), listaBasePaquetes));
        listaPaquetes.add(new Paquete("p7", "paqJ", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(1, "xxxx"), listaBasePaquetes));

        return listaPaquetes;
    }
}
