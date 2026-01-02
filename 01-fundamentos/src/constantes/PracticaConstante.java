package constantes;

import java.util.Scanner;

public class PracticaConstante {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        final double TAX_RATE = 0.10;
        int grossSalary = myObj.nextInt();
        double netSalary = grossSalary * (1 - TAX_RATE);

        System.out.println("netSalary = " + netSalary);
    }
}
