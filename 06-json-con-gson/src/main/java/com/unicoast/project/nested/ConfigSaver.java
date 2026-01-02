package com.unicoast.project.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigSaver {

    // Guarda la configuración en un archivo JSON
    public static void saveConfig(AppConfig config, String filePath) {
        // Crea una instancia de Gson con formato legible
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Intenta escribir el objeto AppConfig en el archivo JSON
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(config, writer);
            System.out.println("Configuración guardada correctamente");
        } catch (IOException e) {
            // Muestra el error si ocurre un problema al guardar
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Carga la configuración existente
        AppConfig config = ConfigLoader.loadConfig("config.json");

        // Si existe, cambia un valor y guarda nuevamente
        if (config != null) {
            config.getSettings().setTheme("Dark");
            config.getSettings().setLanguage("en_US");
            saveConfig(config, "config.json");
        }
    }
}
