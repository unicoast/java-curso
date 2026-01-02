package com.unicoast.estructurasdedatos.iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ExampleListIterator {
    public static void main(String[] args) {
        // Arrays.asList genera una lista inmutable, se puede modificar pero no agregar ni eliminar elementos
        List<String> grandSlams = new ArrayList<>(Arrays.asList("AU Open", "Roland Garros", "Wimbledon", "US Open"));

        System.out.println("grandSlams = " + grandSlams);

        addGs(grandSlams, "ATP Finals");

        readGs(grandSlams);

        updateGs(grandSlams, "AU Open", "Abierto de Australia");
        
        removeGs(grandSlams, "US Open");

        System.out.println("grandSlams = " + grandSlams);
    }

    /**
     *  ListIterator sirve para recorrer una lista en ambos sentidos, hacia adelante y atrás
     *  Puede modificar la lista sin generar excepciones
     */
    public static void addGs(List<String> grandSlams, String newName){
        ListIterator<String> iterator = grandSlams.listIterator();

        while (iterator.hasNext()) {
            String grandSlam = iterator.next();
            if (grandSlam.equals("US Open")) {
                iterator.add(newName);
                break;
            }
        }
    }

    public static void updateGs(List<String> grandSlams, String oldGrandSlam, String newName){
        ListIterator<String> iterator = grandSlams.listIterator();

        while (iterator.hasNext()) {

            if (iterator.next().equals(oldGrandSlam)) {
                iterator.set(newName);
                break;
            }
        }
    }

    public static void removeGs(List<String> grandSlams, String gsToDelete){
        ListIterator<String> iterator = grandSlams.listIterator();

        while (iterator.hasNext()) {

            if (iterator.next().equals(gsToDelete)) {
                iterator.remove();
                break;
            }
        }
    }

    public static void readGs(List<String> grandSlams){
        ListIterator<String> iterator = grandSlams.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        System.out.println();
    }



}
