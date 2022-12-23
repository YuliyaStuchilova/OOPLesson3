package ru.gb.lesson3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
                new Student("Ivan", LocalDate.of(2000,1,10), 4.5),
                new Student("Oleg", LocalDate.of(2001,12,12), 4.9),
                new Student("Mark", LocalDate.of(1999,5,4), 3.8)));


        for (Student student: studentGroup) {
            System.out.println(student);
        }
        System.out.println();


        ListIterator<Student> studentIterator = studentGroup.listIterator();

        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
            System.out.println(studentIterator.nextIndex());
        }
        System.out.println();


        Iterator<Student> it = studentGroup.descendingIterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }


    }


}