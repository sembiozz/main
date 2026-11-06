package org.example;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int speed, int doors) {
        super(brand, year, speed); // вызов конструктора базового класса
        this.doors = doors;
    }

    public int getDoors() { return doors; }
    public void setDoors(int doors) { this.doors = doors; }

    @Override
    public void move() {
        System.out.println("Едет по дороге");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Количество дверей: " + doors);
    }

    public void openTrunk() {
        System.out.println("Багажник открыт");
    }
}