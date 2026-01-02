package com.unicoast.project.validation;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.unicoast.project.Person;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Válida un archivo JSON contra un JSON Schema y,
 * si la validación es exitosa, lo deserializa a objetos Person usando Gson
 */
public class JsonValidatorWithGson {

    public static void main(String[] args) {

        // Configuración de Gson para deserialización
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        /*
         * Se abren TRES FileReader:
         *
         * 1) jsonReader:
         *    Usado por Gson para deserializar el JSON a objetos Java.
         *    Gson consume completamente el Reader y no permite reutilizarlo.
         *
         * 2) schemaReader:
         *    Usado para cargar el JSON Schema.
         *
         * 3) jsonArray:
         *    Usado por org.json / Everit para validar el JSON contra el esquema.
         *    Aunque apunta al mismo archivo que jsonReader, es necesario abrirlo
         *    nuevamente porque el Reader ya fue consumido por Gson.
         */
        try (
                FileReader jsonReader = new FileReader("players.json");
                FileReader schemaReader = new FileReader("players-schema.json");
                FileReader jsonArray = new FileReader("players.json")
        ) {

            // Definición del tipo List<Person> para Gson
            Type listType = new TypeToken<List<Person>>() {}.getType();

            // Deserialización del JSON a objetos Java (Gson)
            List<Person> players = gson.fromJson(jsonReader, listType);

            // Carga del JSON Schema
            JSONObject schemaObject = new JSONObject(new JSONTokener(schemaReader));
            Schema schema = SchemaLoader.load(schemaObject);

            // Carga del JSON como JSONArray para validación (org.json / Everit)
            JSONArray playerJsonArray = new JSONArray(new JSONTokener(jsonArray));

            // Validación del JSON contra el esquema
            schema.validate(playerJsonArray);

            // Impresión de los datos de cada jugador
            for (Person player : players) {
                System.out.println("Nombre: " + player.getName());
                System.out.println("Edad: " + player.getAge());
                System.out.println("País: " + player.getCountry());
                System.out.println("Email: " + player.getEmail());
                System.out.println("Activo: " + player.getActive());
                System.out.println("Hobbies: " + player.getHobbies());
                System.out.println("Grand Slams: " + player.getGrandSlams());
                System.out.println("__________________________________");
            }

            // Confirmación de validación exitosa
            System.out.println("El archivo JSON cumple el esquema definido");

        } catch (IOException e) {
            // Manejo de errores de lectura de archivos
            System.out.println(e.getMessage());
        }
    }
}
