package com.unicoast.exception.autocloseable;

public class CustomResourceExample {
    public static void main(String[] args) {
        // Al finalizar el bloque try-with-resources, Java llama automáticamente a close()
        // sobre FakeDatabaseConnection porque implementa AutoCloseable
        try (FakeDatabaseConnection connection = new FakeDatabaseConnection()){
            connection.fetchData();
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
