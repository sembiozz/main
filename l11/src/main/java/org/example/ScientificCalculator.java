package org.example;

public class ScientificCalculator extends Calculator {
    private boolean hasGraphMode;

    public ScientificCalculator(String model, String version, boolean hasGraphMode) {
        super(model, version);
        this.hasGraphMode = hasGraphMode;
    }

    public boolean isHasGraphMode() { return hasGraphMode; }
    public void setHasGraphMode(boolean hasGraphMode) { this.hasGraphMode = hasGraphMode; }

    @Override
    public String getDescription() {
        return "Научный калькулятор";
    }

    public double calculate(String operation, double a, double b) {
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
            case "^": return Math.pow(a, b);
            default:
                System.out.println("Неизвестная операция: " + operation);
                return 0;
        }
    }
}