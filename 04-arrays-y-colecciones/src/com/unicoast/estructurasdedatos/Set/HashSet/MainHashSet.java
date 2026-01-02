package com.unicoast.estructurasdedatos.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        // Con Set no inserta en un orden específico y no soporta duplicados
        Set<Integer> numbers = new HashSet<>(); // Maneja internamente un código (hash)
        // Esta manera genera el hash a partir del dato, sea un String o Integer
        // solo es válido para clases Wrapper

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(30);

        System.out.println("numbers = " + numbers);

        // Para reemplazar un elemento, este se debe eliminar y añadir uno nuevo
        numbers.remove(60);
        numbers.add(90);

        System.out.println(numbers);
    }
}
