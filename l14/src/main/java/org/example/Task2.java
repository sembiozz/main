import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("f.txt");
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод 10 чисел с клавиатуры и запись в файл
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int num = scanner.nextInt();
                writer.write(String.valueOf(num));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        // 2. Чтение из файла, вывод на экран и поиск минимума
        int min = Integer.MAX_VALUE;
        System.out.println("\nЧисла из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.println(num);
                if (num < min) {
                    min = num;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\nМинимальное значение: " + min);
        scanner.close();
    }
}