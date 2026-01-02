package com.unicoast.exception.basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            // Leer cáracteres de un archivo
            // Clase que mejora la eficiencia de la lectura al permitir leer las líneas completas
            reader = new BufferedReader(new FileReader("src/example.txt"));

            String line;
            // Recorrer el archivo línea por línea
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        } finally {
            try {
                // Cerrar el reader
                if (reader != null){
                    reader.close();
                    System.out.println("Archivo cerrado correctamente");
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }


    }
}
