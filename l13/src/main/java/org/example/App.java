package org.example;

public class App {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC001", "Иван", 1000.0);
        BankAccount acc2 = new BankAccount("ACC002", "Мария", 500.0);
        BankAccount acc3 = new BankAccount("ACC003", "Петр", 0.0);

        System.out.println("=== Начальное состояние ===");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
        System.out.println();

        System.out.println("=== Выполнение операций ===");

        try {
            acc1.deposit(500.0);
            System.out.println("Пополнение ACC001 на 500. Успешно.");
            acc2.withdraw(200.0);
            System.out.println("Снятие с ACC002 на 200. Успешно.");
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            acc1.deposit(500.0);
            System.out.println("Пополнение ACC001 на 500. Успешно.");
            acc2.withdraw(600.0);
            System.out.println("Снятие с ACC002 на 200. Успешно.");
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.err.println("Ошибка");        }

        try {
            acc2.deposit(-50.0);
        } catch (InvalidAmountException e) {
            System.out.println("Ошибка : " + e.getMessage());
        }

        try {
            acc1.transfer("ACC999", 300.0);
        } catch (AccountNotFoundException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("Ошибка перевода: " + e.getMessage());
        }

        System.out.println();
        System.out.println("=== Итоговое состояние ===");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}