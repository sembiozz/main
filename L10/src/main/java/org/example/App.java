package org.example;

public class App {
    public static void main(String[] args) {
        Secure.printSecurityPolicy();
        System.out.println();

        Secure[] accounts = new Secure[5];

        accounts[0] = new PayPal("alice@mail.com", 1000);
        accounts[1] = new PayPal("bob@mail.com", 500);

        accounts[2] = new CreditCard("1111222233334444", 200, 5000);
        accounts[3] = new CreditCard("5555666677778888", 0,   3000);
        accounts[4] = new CreditCard("9999000011112222", 50,  1000);

        for (Secure acc : accounts) {
            System.out.println("--- " + acc);

            if (acc instanceof PaymentSystem) {
                PaymentSystem ps = (PaymentSystem) acc;

                ps.pay(100);

                String pwd = (acc instanceof PayPal) ? "1234" : "0000";
                acc.authenticate(pwd);

                ps.pay(100);
                ps.refund(30);
                System.out.println("Итоговый баланс: " + ps.getBalance());

                acc.logout();
            }
        }
    }
}