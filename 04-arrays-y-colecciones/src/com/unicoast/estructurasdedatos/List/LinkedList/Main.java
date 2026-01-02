package com.unicoast.estructurasdedatos.List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();

        cities.add("Santiago de Chile");
        cities.add("Buenos Aires");
        cities.add("Montevideo");

        ((LinkedList<String>)cities).addFirst("Cancún");
        ((LinkedList<String>)cities).addLast("Río de Janeiro");

        System.out.println(cities.get(2));

        System.out.println(cities);

        cities.set(2, "Bogotá");

        cities.remove("Montevideo");

        System.out.println(cities);

        ((LinkedList<String>)cities).removeFirst();
        ((LinkedList<String>)cities).removeLast();

        System.out.println(cities);

        String searchCity = "Santiago de Chile";

        if(cities.contains(searchCity)){
            System.out.println("Está en la lista");
        } else {
            System.out.println("No está en la lista");
        }

        for (String city: cities){
            System.out.println(" - " + city);
        }
    }
}
