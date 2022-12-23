package ru.gb.lesson3;

import java.util.ListIterator;

public class GroupListIterator implements ListIterator<Student> {

    private final StudentGroup studentGroup;
    private int lastIndex;
    private int startIndex = -1;

    public GroupListIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.lastIndex = this.studentGroup.getSize() - 1;
    }

    @Override
    public boolean hasNext() {
        return startIndex < this.studentGroup.getSize() - 1;
    }

    @Override
    public Student next() {
        return studentGroup.get(++this.startIndex);
    }

    @Override
    public boolean hasPrevious() {
        return lastIndex >= 0;
    }

    @Override
    public Student previous() {
        return studentGroup.get(this.lastIndex--);
    }

    @Override
    public int nextIndex() {
        return startIndex;
    }

    @Override
    public int previousIndex() {
        return lastIndex+1;
    }

    @Override
    public void remove() {
    }

    @Override
    public void set(Student student) {
    }

    @Override
    public void add(Student student) {
    }
}
