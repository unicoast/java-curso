package scannerExample;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = getNumber(scanner, "Ingrese el primer número");

        int secondNumber = getNumber(scanner, "Ingrese el segundo número");

        printResult(firstNumber, secondNumber);

        compareNumber(firstNumber, secondNumber);

    }

    public static int getNumber(Scanner scanner, String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public static void printResult(int firstNumber, int secondNumber){
        System.out.println("La suma de los números es = " + (firstNumber + secondNumber));
        System.out.println("La resta de los números es =  " + (firstNumber - secondNumber));

    }

    public static void compareNumber(int first, int second){
        if(first>second){
            System.out.println("El primer número es mayor");
        } else if (second>first){
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
