package com.unicoast.project.files;

import com.google.gson.Gson;
import com.unicoast.project.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFile {
    public static void main(String[] args) {
        Person person = new Person("Djokovic",25, true);

        Gson gson = new Gson();

        try (FileWriter writer = new FileWriter("person.json")){
            gson.toJson(person, writer);
            System.out.println("Persona guardada correctamente");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader reader = new FileReader("person.json")){
            Person personJson = gson.fromJson(reader, Person.class);
            System.out.println(personJson);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("App finalizada");
    }
}
