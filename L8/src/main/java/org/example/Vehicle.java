package org.example;

public class Vehicle {
    private String brand;
    private int year;
    private int speed;

    public Vehicle(String brand, int year, int speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public String getBrand() { return brand; }
    public int getYear()     { return year; }
    public int getSpeed()    { return speed; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setYear(int year)      { this.year = year; }
    public void setSpeed(int speed)    { this.speed = speed; }

    public void move() {
        System.out.println("Транспортное средство движется");
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand + ", год: " + year + ", макс. скорость: " + speed + " км/ч");
    }
}