package org.example;

public class CreditCard implements PaymentSystem, Secure {
    private String cardNumber;
    private double balance;
    private double limit;
    private boolean authenticated;

    public CreditCard(String cardNumber, double balance, double limit) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.limit = limit;
        this.authenticated = false;
    }

    @Override
    public void pay(double amount) {
        if (!authenticated) {
            System.out.println("CreditCard " + mask() + ": отказ — сначала авторизуйтесь");
            return;
        }
        if (amount <= 0) {
            System.out.println("CreditCard: сумма должна быть положительной");
            return;
        }
        double available = balance + limit;
        if (amount > available) {
            System.out.println("CreditCard " + mask() + ": превышен лимит (доступно " + available + ")");
            return;
        }
        balance -= amount;
        System.out.println("CreditCard " + mask() + ": оплачено " + amount + " ₽, баланс " + balance);
    }

    @Override
    public void refund(double amount) {
        if (!authenticated) {
            System.out.println("CreditCard " + mask() + ": отказ — сначала авторизуйтесь");
            return;
        }
        balance += amount;
        System.out.println("CreditCard " + mask() + ": возврат " + amount + " ₽, баланс " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean authenticate(String password) {
        if ("0000".equals(password)) {
            authenticated = true;
            System.out.println("CreditCard " + mask() + ": авторизация успешна");
            return true;
        }
        System.out.println("CreditCard " + mask() + ": неверный пароль");
        return false;
    }

    @Override
    public void logout() {
        authenticated = false;
        System.out.println("CreditCard " + mask() + ": выход выполнен");
    }

    private String mask() {
        if (cardNumber.length() < 4) return "****";
        return "****" + cardNumber.substring(cardNumber.length() - 4);
    }

    @Override
    public String toString() {
        return "CreditCard{" + mask() + ", balance=" + balance + ", limit=" + limit + "}";
    }
}