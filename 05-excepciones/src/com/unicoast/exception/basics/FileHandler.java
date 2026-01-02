package com.unicoast.exception.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    public static void main(String[] args) {
        try {
            readFile("src/example.txt");
        } catch (FileNotFoundException e) { // Se maneja el caso en que el archivo no existe
            System.out.println("Archivo no encontrado");
        } catch (IOException err){ // Otras excepciones de E/S se muestran por consola
            System.out.println(err.getMessage());
        }
    }

    /*
     * Puede lanzar IOException para que la maneje el método que lo invoque (en este caso, main)
     */
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println("Archivo abierto correctamente");
        reader.close();
    }
}
