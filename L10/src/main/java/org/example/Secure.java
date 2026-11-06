package org.example;

public interface Secure {
    boolean authenticate(String password);
    void logout();

    static void printSecurityPolicy() {
        System.out.println("Политика безопасности: пароль не короче 4 символов, сессия 15 минут.");
    }
}