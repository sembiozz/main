package org.example;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Student(int id, String name, String group, int course, List<Integer> grades) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        if (grades == null || grades.isEmpty()) return 0.0;
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getGroup() { return group; }
    public List<Integer> getGrades() { return grades; }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', group='%s', course=%d, avg=%.2f}",
                id, name, group, course, getAverageGrade());
    }
}