package bucles;

public class EjemplosPracticos {
    public static void main(String[] args) {
        // 1. Sumar números del 1 al N (usando for)
        int N = 10;
        int suma = 0;

        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        System.out.println("Suma del 1 al " + N + " = " + suma);

        String[] frutas = {"manzana", "banana", "kiwi", "pera"};
        String buscada = "kiwi";
        boolean encontrada = false;

        for (String fruta : frutas) {
            if (fruta.equals(buscada)) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("Encontrada: " + buscada);
        } else {
            System.out.println("No se encontró " + buscada);
        }

        int filas = 4;
        /*
            i = 1  | j = 1
            i = 2  | j = 1 2
            i = 3  | j = 1 2 3
            i = 4  | j = 1 2 3 4
         */
        for (int i = 1; i <= filas; i++) { // FILAS
            for (int j = 1; j <= i; j++) { // COLUMNAS
                System.out.print("*");
            }
            System.out.println(); // salto de línea
        }

        int altura = 4;
        /*
            i = 1 | j: 1 2 3       | k: 1       →       "   *"
            i = 2 | j: 1 2         | k: 1 2 3   →       "  ***"
            i = 3 | j: 1           | k: 1 2 3 4 5 →     " *****"
            i = 4 | j: (ninguno)   | k: 1 2 3 4 5 6 7 → "*******"
         */
        // Parte superior (el follaje)
        for (int i = 1; i <= altura; i++) { // fila actual
            for (int j = 1; j <= altura - i; j++) { // espacios a la izquierda
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // asteriscos
                System.out.print("*");
            }
            System.out.println();
        }

        // Tronco
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j < altura; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
