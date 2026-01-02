package com.unicoast.estructurasdedatos.equals;

public class ExampleEquals {
    public static void main(String[] args) {
        Integer numberA = 128;
        Integer numberB = 128;

        // Comparar si las direcciones de memoria son iguales, guarda caché de enteros de -128 a 127 (valores más usados)
        System.out.println(numberA==numberB);

        // Comparar el dato almacenado
        System.out.println(numberB.equals(numberA));
    }
}
