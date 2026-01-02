package com.unicoast.estructurasdedatos.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        // Lista ordenada, doblemente enlazada, referencia, dirección de memoria siguiente y anterior
        Set<Integer> numbers = new LinkedHashSet<>(); // Maneja internamente un código (hash)

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println(numbers);

        numbers.remove(30);

        System.out.println("numbers = " + numbers);

        numbers.remove(60);
        numbers.add(90);

        System.out.println(numbers);

        System.out.println(numbers.contains(50));
    }
}
