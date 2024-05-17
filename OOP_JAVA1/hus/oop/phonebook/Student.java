package hus.oop.phonebook;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private String lastname;
    private String phone;
    private double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Student student = (Student) o;
        return Double.compare(student.average, average) == 0 
                        && Objects.equals(name, student.name) 
                        && Objects.equals(lastname, student.lastname)
                        && Objects.equals(phone, student.phone);
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student[" + "name=" + "\"" + name + "\"" + ", lastname=" + "\"" + lastname 
                + "\"" + ", phone=" + "\"" + phone + "\"" + ", average=" + average + "]";
    }
}
