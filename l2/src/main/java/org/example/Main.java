import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Выберите задание:");
        System.out.println("1 - Поиск цифры в массиве");
        System.out.println("2 - Сумма элементов матрицы 3x3");
        System.out.println("3 - Обе задачи");
        System.out.print("Ваш выбор: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                task1(scanner, random);
                break;
            case 2:
                task2(random);
                break;
            case 3:
                task1(scanner, random);
                task2(random);
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        scanner.close();
    }
    static void task1(Scanner scanner, Random random) {
        System.out.println("\n=== Задание 1 ===");

        int size = 10;
        int[] array = new int[size];
        System.out.print("Массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Введите цифру для поиска (0-9): ");
        int digit = scanner.nextInt();

        int count = 0;
        for (int num : array) {
            switch (num == digit ? 1 : 0) {
                case 1:
                    count++;
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }

        System.out.println("Цифра " + digit + " встречается " + count + " раз(а).");
    }
    static void task2(Random random) {
        System.out.println("\n=== Задание 2 ===");

        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
            }
        }

        int sum = 0;
        System.out.println("Матрица 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
                sum += matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Сумма всех элементов матрицы: " + sum);
    }
}