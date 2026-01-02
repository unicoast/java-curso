package ProyectoFinal;

import java.util.Scanner;

public class BankApp {
    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        // Cuando se crea la App, se inicializa la cuenta y el scanner
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        int option;
        do {
            displayMenu();
            option = getUserOption();
            processOption(option);

        } while (option != 4);
    }

    private void displayMenu(){
        System.out.println("\n==== Seleccionar opciones =====");
        System.out.println("1. Dépositar dinero");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Mostrar saldo");
        System.out.println("4. Salir");
    }

    private int getUserOption(){
        return scanner.nextInt();
    }

    private void handleDeposit(){
        System.out.println("Ingrese el monto a depositar");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
    }

    private void handleWithdrawal(){
        System.out.println("Ingrese el monto a retirar");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
    }

    private void processOption(int option){
        switch (option){
            case 1: {
                handleDeposit();
                break;
            }
            case 2: {
                handleWithdrawal();
                break;
            }
            case 3: {
                account.displayBalance();
                break;
            }
            case 4: {
                System.out.println("Gracias por utilizar la aplicación");
                break;
            }
            default: {
                System.out.println("Opción incorrecta");
            }
        }
    }


}
