package com.unicoast.estructurasdedatos.Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        // Los árboles son más eficientes en las búsquedas porque en cada movimiento recursivo, descarta la mitad de la información
        // Al momento de añadir y eliminar tiene un costo de balanceo de datos
        Set<Integer> numbers = new TreeSet<>(); // Maneja internamente un código (hash)

        numbers.add(10);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);

        System.out.println(numbers);

        numbers.remove(3);

        System.out.println("numbers = " + numbers);

        numbers.remove(1);
        numbers.add(90);

        System.out.println(numbers);

        System.out.println(numbers.contains(50));
    }
}
