package com.unicoast.project.base;

import com.google.gson.Gson;
import com.unicoast.project.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Novak", 38, true);

        Gson gson = new Gson();

        // Serializa la instancia person a su representación JSON
        String json = gson.toJson(person);

        System.out.println(json);

        // json = "{\"name\":\"Novak\",\"age\":38,\"active\":true}";
        json = """
                {
                    "name": "Novak",
                    "age": 25,
                    "active": true
                }
                """;

        // Deserialización: convertir JSON a un objeto Java de tipo Person
        Person person2 = gson.fromJson(json, Person.class);

        // Acceso a los datos del objeto deserializado
        System.out.println("Nombre: " + person2.getName());
        System.out.println("Edad: " + person2.getAge());
        System.out.println("Activo: " + person2.getActive());
    }
}