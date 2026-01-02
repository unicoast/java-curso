package com.unicoast.exception.autocloseable;

// Implementa AutoCloseable para poder usarse en try-with-resources.
// El método close() se ejecutará automáticamente al salir del bloque try.
public class FakeDatabaseConnection implements AutoCloseable {

    public FakeDatabaseConnection() {
        System.out.println("Conexión a la base de datos establecida");
    }

    public void fetchData(){
        System.out.println("Obteniendo información de la base de datos");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Conexión cerrada correctamente");
    }
}
