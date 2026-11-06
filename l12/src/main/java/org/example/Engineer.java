package org.example;

public class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int id, double salary, String specialization) {
        super(name, id, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }

    @Override
    public String toString() {
        return String.format("Engineer{name='%s', id=%d, salary=%.2f, specialization='%s'}",
                name, id, salary, specialization);
    }
}
