package hus.oop.libraby;

import java.util.*;

public class Rent {
    Item item;
    Student student;
    Date begin;
    Date end;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.student = student;
        this.begin = begin;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public Student getStudent() {
        return student;
    }

    public Date getBegin() {
        return begin;
    }

    public Date getEnd() {
        return end;
    }

    @Override
    public String toString() {
        return "Rent[" + "item=" + item + ", student=" + student + ", begin=" + begin + ", end=" + end + "]";
    }
}
