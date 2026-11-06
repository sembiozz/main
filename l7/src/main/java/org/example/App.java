package org.example;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир",              "Л. Н. Толстой",     1225);
        Book book2 = new Book("Преступление и наказание", "Ф. М. Достоевский",  671);
        Book book3 = new Book("Мастер и Маргарита",       "М. А. Булгаков",     480);
        Book book4 = new Book("1984",                     "Дж. Оруэлл",         320);

        System.out.println(" Список книг ");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();

        System.out.println("\n Статистика ");
        Book.printStatistics();

        System.out.println("\nСреднее количество страниц: " + Book.getAveragePages());
    }
}