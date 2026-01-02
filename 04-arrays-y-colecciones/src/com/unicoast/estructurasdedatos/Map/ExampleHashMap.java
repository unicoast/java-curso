package com.unicoast.estructurasdedatos.Map;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {
        // Clave - Valor
        Map<String, Integer> productPrices = new HashMap<>();

        // Agregar elementos
        productPrices.put("S25 Ultra", 1400);
        productPrices.put("Zenbook Duo", 2200);
        productPrices.put("Xbox Series X", 800);

        System.out.println(productPrices);

        // Obtener un dato a través de la key
        System.out.println(productPrices.get("Zenbook Duo"));

        // Actualizar un dato
        productPrices.put("S25 Ultra", 1234);

        System.out.println(productPrices);

        // Eliminar
        productPrices.remove("Xbox Series X");

        System.out.println(productPrices);

    }
}
