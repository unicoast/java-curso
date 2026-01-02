package com.unicoast.project.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {

    // Carga la configuración desde un archivo JSON
    public static AppConfig loadConfig(String filePath) {
        // Crea una instancia de Gson con formato legible
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Intenta leer y convertir el contenido del archivo a un objeto AppConfig
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, AppConfig.class);
        } catch (IOException e) {
            // Muestra el error si ocurre un problema al leer
            System.out.println(e.getMessage());
        }

        // Devuelve null si no se pudo cargar la configuración
        return null;
    }

    public static void main(String[] args) {
        // Carga la configuración desde el archivo config.json
        AppConfig config = loadConfig("config.json");

        // Si se cargó correctamente, muestra los valores
        if (config != null) {
            System.out.println("App Name: " + config.getAppName());
            System.out.println("Version: " + config.getVersion());
            System.out.println("Theme: " + config.getSettings().getTheme());
            System.out.println("Notifications: " + config.getSettings().isNotifications());
            System.out.println("Language: " + config.getSettings().getLanguage());
        }
    }
}
