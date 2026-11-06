package org.example;

public class Plane extends Vehicle {
    private int altitude;

    public Plane(String brand, int year, int speed, int altitude) {
        super(brand, year, speed);
        this.altitude = altitude;
    }

    public int getAltitude() { return altitude; }
    public void setAltitude(int altitude) { this.altitude = altitude; }

    @Override
    public void move() {
        System.out.println("Летит в небе");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Высота полёта: " + altitude + " м");
    }

    public void takeOff() {
        System.out.println("Самолёт взлетает");
    }
}