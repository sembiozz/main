package org.example;

public class Intern extends Employee {
    private int duration;

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    public int getDuration() { return duration; }

    @Override
    public String toString() {
        return String.format("Intern{name='%s', id=%d, salary=%.2f, duration=%d}",
                name, id, salary, duration);
    }
}
