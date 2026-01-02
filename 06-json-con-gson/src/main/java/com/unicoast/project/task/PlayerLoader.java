package com.unicoast.project.task;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.unicoast.project.Person;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class PlayerLoader {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Person>>() {}.getType();
        try (FileReader reader = new FileReader("players.json")){
            List<Person> players = gson.fromJson(reader, listType);

            for(Person player: players){
                System.out.println("Nombre: " + player.getName());
                System.out.println("Edad: " + player.getAge());
                System.out.println("País: " + player.getCountry());
                System.out.println("Activo: " + player.getActive());
                System.out.println("Hobbies: " + player.getHobbies());
                System.out.println("Grand Slams: " + player.getGrandSlams());
                System.out.println("__________________________________");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
