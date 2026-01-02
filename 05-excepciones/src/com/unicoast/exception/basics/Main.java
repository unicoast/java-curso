package com.unicoast.exception.basics;

public class Main {

    public static void recursive(){
        recursive();
    }

    public static void main(String[] args) {
        /*
         * Las excepciones son eventos que ocurren durante la ejecución
         * y que interrumpen el flujo normal del programa.
         * Mediante bloques try-catch podemos capturarlas y manejar el error
         * para que la aplicación no termine de forma abrupta.
         */

        // Tratar este código
        try {
            int result = 10/0;
            System.out.println("Resultado " + result);
        } catch (ArithmeticException e){
            // System.out.println("División por cero");
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Este mensaje se ejecuta siempre");
        }

        try {
            int[] numbers = new int[3];
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            StackTraceElement[] stack = e.getStackTrace();

            for (StackTraceElement element: stack){
                System.out.println("Clase: " + element.getClassName());
                System.out.println("Método: " + element.getMethodName());
                System.out.println("Archivo: " + element.getFileName());
                System.out.println("Línea: " + element.getLineNumber());
            }

        }

        System.out.println("Programa ejecutado");

    }
}