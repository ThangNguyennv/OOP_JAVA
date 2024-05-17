package hus.oop.phonebook;

import java.util.*;

public class PhoneBookMap implements PhoneBook{
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student s) {
        phoneBook.put(s.getPhone(), s);
    }

    @Override
    public Student searchByName(String name) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Student searchByLastName(String lastname) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getLastname().equals(lastname)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getPhone().equals(phone)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (Map.Entry<String, Student> entry : phoneBook.entrySet()) {
            if (entry.getValue().getPhone().equals(phone)) {
                phoneBook.remove(phone);
            }
        }
    }
}
