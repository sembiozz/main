package org.example;

public class Book {
    private String title;
    private String author;
    private int pages;

    private static int totalBooks = 0;
    private static int totalPages = 0;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;

        totalBooks++;
        totalPages += pages;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }

    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPages(int pages) { this.pages = pages; }

    public static double getAveragePages() {
        if (totalBooks == 0) {
            return 0;
        }
        return (double) totalPages / totalBooks;
    }

    public static void printStatistics() {
        System.out.println("Всего книг: " + totalBooks);
        System.out.println("Всего страниц: " + totalPages);
        System.out.println("Среднее количество страниц: " + getAveragePages());
    }

    public void displayInfo() {
        System.out.println("Книга: \"" + title + "\", автор: " + author + ", страниц: " + pages);
    }
}