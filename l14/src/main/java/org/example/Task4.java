import java.io.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("humidity.txt");
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод 12 значений влажности
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Введите 12 значений влажности воздуха (%):");
            for (int i = 0; i < 12; i++) {
                System.out.print("Значение " + (i + 1) + ": ");
                double value = scanner.nextDouble();
                writer.write(String.valueOf(value));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        // 2. Чтение и вычисление среднего
        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                double value = Double.parseDouble(line.trim());
                System.out.println("Влажность: " + value + "%");
                sum += value;
                count++;
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }

        if (count > 0) {
            System.out.printf("%nСредняя влажность: %.2f%%%n", sum / count);
        }
        scanner.close();
    }
}