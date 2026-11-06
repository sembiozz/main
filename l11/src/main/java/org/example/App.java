package org.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== 1. Перегрузка (статический полиморфизм) ===");

        Calculator calc = new Calculator("Casio FX-82", "1.0");

        System.out.println("calculate(int, int)         = " + calc.calculate(2, 3));
        System.out.println("calculate(int, int, int)    = " + calc.calculate(2, 3, 4));
        System.out.println("calculate(double, double)   = " + calc.calculate(2.5, 3.5));
        System.out.println("calculate(int, double)      = " + calc.calculate(2, 3.5));

        System.out.println("\n=== 2. Переопределение (динамический полиморфизм) ===");

        Calculator[] calculators = new Calculator[] {
                new Calculator("Casio FX-82", "1.0"),
                new ScientificCalculator("Casio FX-991", "2.1", true),
                new EngineeringCalculator("HP 48G", "3.0", 8)
        };

        for (Calculator c : calculators) {
            c.printInfo();
        }

        System.out.println("\n=== 3. Уникальные методы наследников ===");

        ScientificCalculator sci = new ScientificCalculator("Casio FX-991", "2.1", true);
        System.out.println("Научный: 2 ^ 10      = " + sci.calculate("^", 2, 10));
        System.out.println("Научный: 10 / 4      = " + sci.calculate("/", 10, 4));

        EngineeringCalculator eng = new EngineeringCalculator("HP 48G", "3.0", 8);
        System.out.println("Инженерный: 17 % 5   = " + eng.calculate(17, 5, "%"));
        System.out.println("Инженерный: 12 * 12  = " + eng.calculate(12, 12, "*"));

        System.out.println("\n=== 4. Сравнение ===");

        Calculator c1 = new Calculator("X", "1");
        System.out.println("Вызов calc.calculate(2, 3)     — версия известна компилятору (int+int)");

        Calculator c2 = new ScientificCalculator("Y", "2", false);
        Calculator c3 = new EngineeringCalculator("Z", "3", 4);
        System.out.println("c2.getDescription() = " + c2.getDescription() + "  ← реальный тип: ScientificCalculator");
        System.out.println("c3.getDescription() = " + c3.getDescription() + "  ← реальный тип: EngineeringCalculator");
    }
}