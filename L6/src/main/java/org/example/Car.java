package org.example;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;


     private String brand1;
     private static int cars = 0;

     public String getBrand1() {
         return brand1;
     }
     public void  setBrand1(String brand1){
         this.brand1 =brand1;
     }

     public Car(String brand, String model, int year, int mileage, String brand1){
         this(brand, model, year, mileage);
         this.brand1=brand1;
     }
public  void test(){
         System.out.println(brand);
    System.out.println(model);
    System.out.println(brand1);
    System.out.println(year);
    System.out.println(mileage);
}
public static void test1(Car car) {
    System.out.println(car.brand);
    System.out.println(car.brand1);
    System.out.println(car.model);
    System.out.println(car.year);
    System.out.println(car.mileage);
}
/*
System.out.println();
car.test();

Car.test1(car);
 */



































    public Car(String brand, String model, int year, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getMileage() { return mileage; }

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setMileage(int mileage) { this.mileage = mileage; }

    public void drive(int km) {
        if (km > 0) {
            this.mileage += km;
        } else {
            System.out.println("Количество километров должно быть положительным!");
        }
    }

    public void displayInfo() {
        System.out.println("Автомобиль: " + brand + " " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Пробег: " + mileage + " км");
    }
}