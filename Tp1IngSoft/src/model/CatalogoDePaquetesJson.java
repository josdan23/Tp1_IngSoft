package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import service.IAdaptadorCatalogoDePaquetes;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josdan
 */
public class CatalogoDePaquetesJson implements IAdaptadorCatalogoDePaquetes {

    @Override
    public ArrayList<Paquete> obtenerPaquetes() {
        Gson gson = new Gson();
        try {
            FileReader reader = new FileReader("src/data/Paquetes.json");
            BufferedReader buffer = new BufferedReader(reader);
            String jsonString = "";
            String aux = "";
            while ((aux = buffer.readLine()) != null) {
                jsonString += aux;
            }
            Type listadoPaquetes = new TypeToken<ArrayList<Paquete>>() {
            }.getType();
            return gson.fromJson(jsonString, listadoPaquetes);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
