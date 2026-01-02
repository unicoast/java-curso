package bucles;

public class Ejercicio {
    public static void main(String[] args) {
        // Tablas de multiplicar
        int contador = 1;
        int numTabla = 12; // Cambia este valor para ver la tabla del número que quieras

        while (contador <= 12) {
            System.out.println(numTabla + " * " + contador + " = " + (numTabla * contador));
            contador++;
        }

        /*
        do {
            System.out.println(numTabla + " * " + i + " = " + (numTabla * i));
            i++;
        } while (i <= 12);
        */

        for (int t = 1; t <= 12; t++) {
            System.out.println("Tabla del " + t);
            for (int i = 1; i <= 12; i++) {
                System.out.println(t + " * " + i + " = " + (t * i));
            }
            System.out.println(); // línea vacía entre tablas
        }
    }
}
