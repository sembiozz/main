package org.example;

public class App
{
    public static void main( String[] args )
    {
        Car car = new Car("Toyota", "Camry", 2020, 15000);

        System.out.println("=== До поездки ===");
        car.displayInfo();

        car.drive(100);

        System.out.println("\n=== После поездки на 100 км ===");
        car.displayInfo();

        System.out.println("\nОбновлённый пробег: " + car.getMileage() + " км");
    }
}