import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("group.txt");

        // 1. Создаём файл и записываем информацию о группе
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Группа: 5-04-0612-02");
            writer.newLine();
            writer.write("Специальность: Разработка и сопровождение ПО информационных систем");
            writer.newLine();
            writer.write("Количество студентов: 25");
            writer.newLine();
            writer.write("Куратор: Кибисова А.С.");
            writer.newLine();
            System.out.println("Файл создан и заполнен.");
        } catch (IOException e) {
            System.err.println("Ошибка записи: " + e.getMessage());
        }

        // 2. Выводим данные об этом файле
        System.out.println("\n--- Данные о файле ---");
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Последняя модификация: " + file.lastModified());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Существует: " + file.exists());
        System.out.println("Доступен для чтения: " + file.canRead());
        System.out.println("Доступен для записи: " + file.canWrite());
        System.out.println("Это файл: " + file.isFile());

        // 3. Выводим информацию из файла
        System.out.println("\n--- Содержимое файла ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения: " + e.getMessage());
        }
    }
}