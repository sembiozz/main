package org.example;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];

        vehicles[0] = new Car("Toyota", 2020, 220, 4);
        vehicles[1] = new Car("BMW", 2022, 250, 2);
        vehicles[2] = new Car("Kia", 2018, 190, 4);

        vehicles[3] = new Plane("Boeing", 2015, 900, 11000);
        vehicles[4] = new   Plane("Airbus", 2019, 870, 12000);

        for (Vehicle v : vehicles) {
            System.out.println("---");
            v.displayInfo();
            v.move();

            if (v instanceof Car) {
                ((Car) v).openTrunk();
            } else if (v instanceof Plane) {
                ((Plane) v).takeOff();
            }
        }
    }
}