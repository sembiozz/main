import java.io.*;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        File file = new File("f5.txt");
        Random random = new Random();

        // 1. Создаём файл с 10 целыми числами (в т.ч. отрицательными)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                // диапазон от -50 до 49
                int num = random.nextInt(100) - 50;
                writer.write(String.valueOf(num));
                writer.newLine();
            }
            System.out.println("Файл f5.txt создан.");
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        // 2. Чтение и подсчёт отрицательных
        int negativeCount = 0;
        System.out.println("\nЧисла из файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                System.out.println(num);
                if (num < 0) {
                    negativeCount++;
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\nКоличество отрицательных чисел: " + negativeCount);
    }
}