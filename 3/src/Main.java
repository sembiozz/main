import java.util.Scanner;

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
        System.out.println("--------------------------------");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s | %15.2f%n",
                    employees[i].fullname, employees[i].salary);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Длина строки");
        System.out.println("2 - Разбить предложение на слова");
        System.out.println("3 - Отчёт по зарплатам сотрудников");
        System.out.println("4 - Найти строки 'a...a' с 'e' или 'x' внутри");
        System.out.print("Выберите задачу: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Введите строку: ");
                String s1 = sc.nextLine();
                System.out.println("Длина строки: " + s1.length());
                break;

            case 2:
                System.out.print("Введите предложение: ");
                String s2 = sc.nextLine();
                String[] words = s2.split("\\s+");
                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                }
                break;

            case 3:
                Employee[] employees = {
                        new Employee("Ivanov", 45000.5),
                        new Employee("Petrova", 62000.75),
                        new Employee("Sidorov", 38000.0),
                        new Employee("Kuznetsova", 71500.25)
                };
                Report.generateReport(employees);
                break;

            case 4:
                String s4 = "aeeea aeea aea axa axxa axxxa";
                String[] parts = s4.split("\\s+");
                System.out.println("Подходящие строки:");
                for (int i = 0; i < parts.length; i++) {
                    String word = parts[i];
                    if (word.matches("ae+a") || word.matches("ax+a")) {
                        System.out.println(word);
                    }
                }
                break;

            default:
                System.out.println("Неверный выбор.");
        }
    }
}1