package ProyectoFinal;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Aeroespacial",10000.0);
        BankApp bankApp = new BankApp(bankAccount);

        bankApp.start();
    }
}
