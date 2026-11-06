import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Подсчёт вхождений цифры в массив");
        System.out.println("2 - Сумма элементов матрицы 3x3");
        System.out.print("Выберите задачу: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int[] arr = new int[10];
                Random random = new Random();

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(10);
                }

                System.out.print("Введите цифру: ");
                int digit = sc.nextInt();

                int count = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == digit) {
                        count++;
                    }
                }
                System.out.println("Цифра " + digit + " встречается " + count + " раз(а).");
                break;
            case 2:

                int[][] matrix = new int[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }
//                int[][] matrix = {
//                        {1, 2, 3},
//                        {4, 5, 6},
//                        {7, 8, 9}
//                };


                int sum = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        sum = sum + matrix[i][j];
                    }
                }

                System.out.println("Сумма элементов матрицы: " + sum);
                break;

            default:
                System.out.println("Неверный выбор.");
        }
    }
}