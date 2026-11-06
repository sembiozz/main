package org.example;

public class PayPal implements PaymentSystem, Secure {
    private String email;
    private double balance;
    private boolean authenticated;

    public PayPal(String email, double balance) {
        this.email = email;
        this.balance = balance;
        this.authenticated = false;
    }

    @Override
    public void pay(double amount) {
        if (!authenticated) {
            System.out.println("PayPal: отказ — сначала авторизуйтесь");
            return;
        }
        if (amount <= 0) {
            System.out.println("PayPal: сумма должна быть положительной");
            return;
        }
        if (amount > balance) {
            System.out.println("PayPal: недостаточно средств");
            return;
        }
        balance -= amount;
        System.out.println("PayPal (" + email + "): оплачено " + amount + " ₽, остаток " + balance);
    }

    @Override
    public void refund(double amount) {
        if (!authenticated) {
            System.out.println("PayPal: отказ — сначала авторизуйтесь");
            return;
        }
        balance += amount;
        System.out.println("PayPal (" + email + "): возврат " + amount + " ₽, баланс " + balance);
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean authenticate(String password) {
        if ("1234".equals(password)) {
            authenticated = true;
            System.out.println("PayPal: авторизация успешна");
            return true;
        }
        System.out.println("PayPal: неверный пароль");
        return false;
    }

    @Override
    public void logout() {
        authenticated = false;
        System.out.println("PayPal: выход выполнен");
    }

    @Override
    public String toString() {
        return "PayPal{email='" + email + "', balance=" + balance + "}";
    }
}