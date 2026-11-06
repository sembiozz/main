package org.example;

public class EngineeringCalculator extends Calculator {
    private int precision;

    public EngineeringCalculator(String model, String version, int precision) {
        super(model, version);
        this.precision = precision;
    }

    public int getPrecision() { return precision; }
    public void setPrecision(int precision) { this.precision = precision; }

    @Override
    public String getDescription() {
        return "Инженерный калькулятор";
    }

    public int calculate(int a, int b, String operation) {
        switch (operation) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Деление на ноль!");
                    return 0;
                }
                return a / b;
            case "%": return a % b;
            default:
                System.out.println("Неизвестная операция: " + operation);
                return 0;
        }
    }
}