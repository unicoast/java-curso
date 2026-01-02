package com.unicoast.estructurasdedatos.Map;

import java.util.Map;
import java.util.TreeMap;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.id, o.id);
    }

    public static void main(String[] args) {
        // Ordenar por más de un criterio, usar el Producto como clave
        Map<Product, Double> pricesMap = new TreeMap<>();

        pricesMap.put(new Product(191, "Notebook"), 1000.0);
        pricesMap.put(new Product(192, "Smartphone"), 1000.0);
        pricesMap.put(new Product(193, "Tablet"), 1000.0);

        System.out.println(pricesMap);

        // Eliminar
        pricesMap.remove(new Product(192, "Notebook"));

        System.out.println(pricesMap);

        // Actualizar
        pricesMap.put(new Product(193, "Tablet"), 500.0);

        System.out.println(pricesMap);

        // Buscar
        System.out.println(pricesMap.get(new Product(193, "Tablet")));

    }
}
