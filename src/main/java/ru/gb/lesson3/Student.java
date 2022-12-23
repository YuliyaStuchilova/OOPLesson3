package ru.gb.lesson3;

import java.time.LocalDate;

public class Student {

    private String name;
    private LocalDate date;
    private Double averageMark;

    public Student(String name, LocalDate date, Double averageMark) {
        this.name = name;
        this.date = date;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", averageMark=" + averageMark +
                '}';
    }
}
