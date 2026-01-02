package com.unicoast.exception.personalized.unchecked;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new NegativeBalanceException("Fondos insuficientes");
        }

        balance += amount;
        System.out.println("Monto retirado exitosamente");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = null;

        /*
         * Maneja explícitamente sobregiro: muestra mensaje y mantiene cuenta inicial.
         * Evita que RuntimeException termine el programa abruptamente.
         */
        try {
            account = new BankAccount(500.0);
            account.withdraw(700);
        } catch (NegativeBalanceException e){
            System.out.println(e.getMessage());
        }

        /*
         * Muestra saldo final (500.0, ya que withdraw falló).
         * account no es null por construcción en try.
         */
        System.out.println("Saldo disponible: " + account.getBalance());
    }
}
