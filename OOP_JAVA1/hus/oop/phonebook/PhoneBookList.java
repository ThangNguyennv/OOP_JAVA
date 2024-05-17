package hus.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    ArrayList<Student> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.add(p);
    }

    @Override
    public Student searchByName(String name) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getName().equals(name)) {
                return phoneBook.get(i);
            }
        }
        return null;
    }

    public Student searchByLastName(String lastname) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getLastname().equals(lastname)) {
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phone)) {
                return phoneBook.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getPhone().equals(phone)) {
                phoneBook.remove(phone);
                break;
            }
        }
    }
}
