package org.example;

public class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("%s{name='%s', id=%d, salary=%.2f}",
                getClass().getSimpleName(), name, id, salary);
    }
}

