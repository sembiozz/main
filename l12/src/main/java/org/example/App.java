package org.example;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<String, Employee> employees = new TreeMap<>();

        employees.put("Alice", new Manager("Alice", 1, 5000, 5));
        employees.put("Bob",   new Manager("Bob",   2, 4800, 7));
        employees.put("Carol", new Manager("Carol", 3, 5200, 4));

        employees.put("David", new Engineer("David", 4, 3500, "Backend"));
        employees.put("Eve",   new Engineer("Eve",   5, 3700, "Frontend"));
        employees.put("Frank", new Engineer("Frank", 6, 3600, "DevOps"));

        employees.put("Grace", new Intern("Grace", 7, 800, 3));
        employees.put("Henry", new Intern("Henry", 8, 900, 6));

        System.out.println("=== Все сотрудники ===");
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}