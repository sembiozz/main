import java.io.*;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        File f = new File("f3.txt");
        File g = new File("g3.txt");
        File h = new File("h3.txt");
        Random random = new Random();

        // 1. Создаём файл f со случайными числами
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(f))) {
            for (int i = 0; i < 20; i++) {
                writer.write(String.valueOf(random.nextInt(100)));
                writer.newLine();
            }
            System.out.println("Файл f создан.");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // 2. Распределяем числа в g (кратные 3) и h (остальные)
        try (BufferedReader reader = new BufferedReader(new FileReader(f));
             BufferedWriter writerG = new BufferedWriter(new FileWriter(g));
             BufferedWriter writerH = new BufferedWriter(new FileWriter(h))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int num = Integer.parseInt(line.trim());
                if (num % 3 == 0) {
                    writerG.write(String.valueOf(num));
                    writerG.newLine();
                } else {
                    writerH.write(String.valueOf(num));
                    writerH.newLine();
                }
            }
            System.out.println("Файлы g и h заполнены.");
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        // 3. Вывод результатов
        System.out.println("\n--- Файл f ---");
        printFile(f);
        System.out.println("\n--- Файл g (кратные 3) ---");
        printFile(g);
        System.out.println("\n--- Файл h (остальные) ---");
        printFile(h);
    }

    static void printFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.print(line + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}