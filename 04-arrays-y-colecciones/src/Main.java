import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Define arreglo [], guarda muchos datos de tipo entero
        // Estructura de datos estática, no más de 3 números
        Integer[] numbers = {1,2,3};

        System.out.println(numbers[0]);

        numbers[0] = 100;

        System.out.println(numbers[0]);

        // Crea un arreglo de 100 enteros primitivos (valores simples)
        // Usa 'new' para reservar espacio en memoria para el arreglo (no es para crear una instancia)
        // Los arreglos son objetos que almacenan múltiples valores del mismo tipo
        int[] fixedArray = new int[100];

        System.out.println("Dimensión: " + fixedArray.length);

        // Estructura de datos dinámica, no necesita definir cuántos datos se van a almacenar
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.add(1);
        numbers2.add(10);
        numbers2.add(100);

        System.out.println("numbers2 = " + numbers2);
        
    }
}