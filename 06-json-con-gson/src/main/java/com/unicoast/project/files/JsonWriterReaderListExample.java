package com.unicoast.project.files;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.unicoast.project.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonWriterReaderListExample {

    public static void main(String[] args) {

        // Lista que contendrá las personas leídas desde el archivo JSON
        List<Person> people = new ArrayList<>();

        // Instancia de Gson para serialización y deserialización
        Gson gson = new Gson();

        // ===================== LECTURA =====================
        System.out.println("===== Lectura de lista desde JSON =====");

        try (FileReader reader = new FileReader("persons.json")) {

            // TypeToken es necesario debido al type erasure de Java.
            // Permite a Gson conocer el tipo genérico completo: List<Person>
            Type listType = new TypeToken<List<Person>>() {}.getType();

            // Deserializa el contenido del archivo JSON a una lista de objetos Person
            people = gson.fromJson(reader, listType);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Muestra los datos leídos desde el archivo
        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Active: " + person.getActive());
            System.out.println("________________________________");
        }

        System.out.println("===== Fin lectura de lista JSON =====");

        // Se agrega una nueva persona a la lista en memoria
        people.add(new Person("Andy", 38, "British", false));

        // ===================== ESCRITURA =====================
        System.out.println("===== Escritura de lista en JSON =====");

        try (FileWriter writer = new FileWriter("persons.json")) {

            // Serializa la lista actualizada y sobrescribe el archivo JSON
            gson.toJson(people, writer);
            System.out.println("Persona guardada correctamente");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("===== Fin escritura de lista en JSON =====");

        // ===================== VERIFICACIÓN =====================
        System.out.println("===== Verificación de contenido JSON =====");

        try (FileReader reader = new FileReader("persons.json")) {

            Type listType = new TypeToken<List<Person>>() {}.getType();
            people = gson.fromJson(reader, listType);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Muestra el contenido final del archivo JSON
        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Country: " + person.getCountry());
            System.out.println("Active: " + person.getActive());
            System.out.println("________________________________");
        }
    }
}
