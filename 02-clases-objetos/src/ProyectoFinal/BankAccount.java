package ProyectoFinal;

// Crear una cuenta de banco, poder depositar, retirar, mostrar el saldo de una cuenta

public class BankAccount {
    // Propiedades, atributos
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Depósito exitoso!!!!");
        } else {
            System.out.println("El monto ingresado no es válido");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Retiro exitoso!!!!");
        } else {
            System.out.println("Fondos insuficientes o monto inválido");
        }
    }

    public void displayBalance(){
        System.out.println("Saldo = " + balance);
    }
}
