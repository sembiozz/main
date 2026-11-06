package org.example;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Номер счета не может быть null");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Баланс не может быть отрицательным");
        }
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Сумма пополнения должна быть больше нуля");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Сумма снятия должна быть больше нуля");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств", amount, balance);
        }
        balance -= amount;
    }

    public void transfer(String target, double amount)
            throws AccountNotFoundException, InsufficientFundsException, InvalidAmountException {
        if (target == null || target.isEmpty()) {
            throw new AccountNotFoundException("Счет получателя не найден");
        }

        this.withdraw(amount);
        this.balance -= amount;

        System.out.println("Перевод " + amount + " на счет " + target + " выполнен успешно.");
    }

    @Override
    public String toString() {
        return "Счет: " + accountNumber + " | Владелец: " + owner + " | Баланс: " + balance;
    }
}