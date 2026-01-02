package com.unicoast.estructurasdedatos.iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    public static void main(String[] args) {
        List<String> grandSlams = new ArrayList<>();

        grandSlams.add("AU Open");
        grandSlams.add("Roland Garros");
        grandSlams.add("Wimbledon");
        grandSlams.add("US Open");

        // For each usa un Iterator y no soporta modificaciones mientras recorre la colección
        // Un iterador es un objeto que permite recorrer una colección secuencialmente sin exponer su estructura interna
        /*
        for (String grandSlam: grandSlams){
            if (grandSlam.startsWith("A") || grandSlam.startsWith("U")){
                grandSlams.remove(grandSlam); // Elimina un elemento, el iterador no está al tanto del cambio
                // En la siguiente iteración detecta el cambio y lanza una excepción
            }
        }
        */

        // Si se requiere modificar una colección, es conveniente usar un iterador
        Iterator<String> iterator = grandSlams.iterator();

        while (iterator.hasNext()) {
            String grandSlam = iterator.next();
            if (grandSlam.startsWith("A") || grandSlam.startsWith("U")) {
                iterator.remove();  // Elimina el elemento actual de forma segura
            }
        }

        System.out.println(grandSlams);

    }
}
