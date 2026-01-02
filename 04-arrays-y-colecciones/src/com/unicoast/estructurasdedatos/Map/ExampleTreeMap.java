package com.unicoast.estructurasdedatos.Map;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        // Clave - Valor, orden por alfabeto
        Map<String, Integer> productPrices = new TreeMap<>();

        // Agregar elementos
        productPrices.put("S25 Ultra", 1400);
        productPrices.put("Zenbook Duo", 2200);
        productPrices.put("Xbox Series X", 900);
        productPrices.put("IPHONE 17 Pro Max", 1800);
        productPrices.put("RTX 5090", 2000);

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
