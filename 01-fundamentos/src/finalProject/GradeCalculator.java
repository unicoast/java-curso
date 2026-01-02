package finalProject;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Usuario ingresa edad y 3 calificaciones de un estudiante
        // Calcular el promedio de las calificaciones
        // Evaluar si el estudiante aprobó o no (> 4)
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        do {
            System.out.println("Ingrese Nombre");
            String userName = scanner.next();

            System.out.println("Ingrese 3 calificaciones: ");
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            int grade3 = scanner.nextInt();

            int sum = grade1+grade2+grade3;
            double average = sum/3.0;

            if(average>=4){
                System.out.println("Usuario " + userName + " APROBADO!");
            } else {
                System.out.println("Usuario " + userName + " REPROBADO!");
            }

            System.out.println("¿Desea Ingresar nuevos datos? (1 para sí, 0 para no): ");
            int option = scanner.nextInt();
            repeat = option == 1;
        } while(repeat);


    }
}
