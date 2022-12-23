package ru.gb.lesson3;

import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {
    private final StudentGroup studentGroup;
    private int index;


    public ReverseIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.index = this.studentGroup.getSize()-1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return studentGroup.get(index--);
    }

}
