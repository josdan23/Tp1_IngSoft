package model;

import java.util.ArrayList;

/**
 *
 * @author josdan
 */
public class CatalogoDePaquete {

    public ArrayList<Paquete> obtenerPaquetes() {
        
        ArrayList<Paquete> listaPaquetes = new ArrayList<Paquete>();
        
        listaPaquetes.add(new Paquete("p1", "paqA", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(1,"xxxx")));
        listaPaquetes.add(new Paquete("p2", "paqB", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(2,"xxxx")));
        listaPaquetes.add(new Paquete("p3", "paqC", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(3,"xxxx")));
        listaPaquetes.add(new Paquete("p4", "paqD", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(4,"xxxx")));
        listaPaquetes.add(new Paquete("p5", "paqE", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(5,"xxxx")));
        listaPaquetes.add(new Paquete("p6", "paqF", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(3,"xxxx")));
        listaPaquetes.add(new Paquete("p7", "paqJ", "xxxx", "xxxx", " xxxx", 2, 3, new Ciudad(1,"xxxx")));
        
        return listaPaquetes;
    }
}
