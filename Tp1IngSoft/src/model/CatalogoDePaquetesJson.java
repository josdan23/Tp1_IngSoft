package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
            Type listadoPaquetes = new TypeToken<ArrayList<Paquete>>() {
            }.getType();
            return gson.fromJson(reader, listadoPaquetes);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void almacenarPaquetes(ArrayList<Paquete> paquetes) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter writer = new FileWriter("src/data/Paquetes.json");
            String jsonString = gson.toJson(paquetes);
            writer.write(jsonString);
            writer.flush();
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
