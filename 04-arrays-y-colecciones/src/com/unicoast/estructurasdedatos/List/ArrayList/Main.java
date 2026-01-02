package com.unicoast.estructurasdedatos.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
         * La interfaz List para programar contra la abstracción y no contra la implementación concreta (ArrayList),
         * lo que da más flexibilidad y mejor diseño de código.
         */
        List<String> students = new ArrayList<>();

        students.add("Nico");
        students.add("Novak");
        students.add("Roger");
        students.add("Fernando");

        students.add(2, "Rafa");

        System.out.println(students);

        System.out.println(students.get(0));

        System.out.println(students.remove(3));

        System.out.println(students);

        System.out.println(students.set(0, "Joaquín"));

        System.out.println(students);

        System.out.println(students.contains("Novak"));
    }
}
