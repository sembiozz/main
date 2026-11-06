package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Алексей", "IT-11", 1, Arrays.asList(5, 4, 3, 5)));
        students.add(new Student(2, "Борис", "IT-11", 1, Arrays.asList(2, 2, 3, 2)));
        students.add(new Student(3, "Виктор", "IT-12", 2, Arrays.asList(4, 4, 4, 4)));
        students.add(new Student(4, "Анна", "IT-12", 2, Arrays.asList(5, 5, 5, 5)));
        students.add(new Student(5, "Дмитрий", "IT-11", 1, Arrays.asList(1, 2, 3, 2)));
        students.add(new Student(6, "Богдан", "IT-12", 2, Arrays.asList(4, 4, 4, 4)));

        System.out.println("--- Исходный список ---");
        students.forEach(System.out::println);
        System.out.println();

        students.removeIf(s -> s.getAverageGrade() < 3);
        System.out.println("--- После удаления студентов со ср. баллом < 3 ---");
        students.forEach(System.out::println);
        System.out.println();

        for (Student s : students) {
            if (s.getAverageGrade() >= 3) {
                s.setCourse(s.getCourse() + 1);
            }
        }
        System.out.println("--- После перевода на следующий курс ---");
        students.forEach(System.out::println);
        System.out.println();

        printStudents(students, 3);
        System.out.println();

        students.sort(Comparator
                .comparingDouble(Student::getAverageGrade).reversed()
                .thenComparing(Student::getName));

        System.out.println("--- Отсортированный список (ID, Имя, Средний балл) ---");
        for (Student s : students) {
            System.out.printf("ID: %d | Имя: %-10s | Средний балл: %.2f%n",
                    s.getId(), s.getName(), s.getAverageGrade());
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("--- Студенты на " + course + " курсе ---");
        boolean found = false;
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName() + " (ID: " + s.getId() + ")");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Студентов на этом курсе нет.");
        }
    }
}