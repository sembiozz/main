package org.example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() { return teamSize; }

    @Override
    public String toString() {
        return String.format("Manager{name='%s', id=%d, salary=%.2f, teamSize=%d}",
                name, id, salary, teamSize);
    }
}
