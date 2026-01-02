package bucles;

public class Bucle {
    public static void main(String[] args) {

        final int MAX_COUNT = 5;
        for (int currentNumber = 1; currentNumber <= MAX_COUNT; currentNumber++) {
            System.out.println("Valor = " + currentNumber);
        }

        int counter = 0;
        int acumulador = 0;
        while (counter < MAX_COUNT) {
            acumulador += counter; // Suma el valor actual de counter al acumulador
            // En cada vuelta: 0 + 1 + 2 + 3 + 4 = 10
            counter++; // Luego incrementa counter en 1
            // El bucle se repite mientras counter < 5
        }
        System.out.println("Acumulador = " + acumulador);

        int suma = 0;
        int numMaximo = 10;
        int i = 1;
        while(i <= numMaximo){
            suma += i;
            i++;
        }
        System.out.println("suma = " + suma);

        int contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        } while(contador < 5);
    }
}
