package com.unicoast.exception.basics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {

        // Condición: Si el archivo se puede abrir
        try (BufferedReader reader = new BufferedReader(new FileReader("src/example.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no fue encontrado");
        } catch (IOException e){
            System.out.println("Error en la lectura del archivo");
        }
    }
}
