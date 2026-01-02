package com.unicoast.project.task;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.unicoast.project.Person;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PlayerSaver {
    public static void main(String[] args) {

        Person person1 = new Person("Novak Djokovic", 38, "Serbia", true,
                Arrays.asList("Ciclismo", "Senderismo", "Yoga"),
                Map.of("Australian Open", 10,
                        "Roland Garros", 3,
                        "Wimbledon", 7,
                        "US Open", 4
                )
        );

        Person person2 = new Person("Rafael Nadal", 39, "España", false,
                Arrays.asList("Fútbol", "Pesca", "Golf"),
                Map.of("Australian Open", 2,
                        "Roland Garros", 14,
                        "Wimbledon", 2,
                        "US Open", 4
                )
        );

        Person person3 = new Person("Roger Federer", 44, "Suiza", false,
                Arrays.asList("Golf", "Videojuegos", "Esquí"),
                Map.of("Australian Open", 6,
                        "Roland Garros", 1,
                        "Wimbledon", 8,
                        "US Open", 5
                )
        );

        List<Person> people =  Arrays.asList(person1, person2, person3);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter writer = new FileWriter("players.json")){
            gson.toJson(people, writer);
            System.out.println("Lista de jugadores guardada correctamente");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
