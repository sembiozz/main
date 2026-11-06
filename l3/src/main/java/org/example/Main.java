import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу:");
        System.out.println("1 - Длина строки");
        System.out.println("2 - Разбить предложение на слова");
        System.out.println("3 - Зарплаты сотрудников (Employee + Report)");
        System.out.println("4 - Слова по шаблону");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("\n=== Задача 1: Длина строки ===");
                System.out.print("Введите строку: ");
                String input = scanner.nextLine();
                System.out.println("Длина строки: " + input.length());
                break;

            case 2:
                System.out.println("\n Задача 2: Разбить на слова ");
                System.out.print("Введите предложение: ");
                String sentence = scanner.nextLine();
                String[] words = sentence.trim().split("\\s+");
                for (String word : words) {
                    System.out.println(word);
                }
                break;

            case 3:
                System.out.println("\n Задача 3: Зарплаты сотрудников ");
                Employee[] employees = {
                        new Employee("Иванов", 55000.5),
                        new Employee("Петров", 72000.0),
                        new Employee("Сидоров", 48000.75),
                        new Employee("Кузнецов", 91500.25),
                        new Employee("Смирнов", 63000.0)
                };
                Report.generateReport(employees);
                break;

            case 4:
                System.out.println("\n=== Задача 4: Слова по шаблону ===");
                String str = "aeeea aeea aea axa axxa axxxa";
                String[] parts = str.split(" ");

                System.out.println("Исходная строка: " + str);
                System.out.println("Подходящие слова:");
                for (String word : parts) {
                    if (word.matches("ae+a") || word.matches("ax+a")) {
                        System.out.println(word);
                    }
                }
                break;

            default:
                System.out.println("Неверный номер задачи.");
        }

        scanner.close();
    }
}
class Employee {
    String fullname;
    double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}
class Report {
    static void generateReport(Employee[] employees) {
        System.out.printf("%-15s | %15s%n", "Фамилия", "Зарплата");
        for (Employee e : employees) {
            System.out.printf("%-15s | %15.2f%n", e.fullname, e.salary);
        }
    }
}
// if (i + j == n - 1) {