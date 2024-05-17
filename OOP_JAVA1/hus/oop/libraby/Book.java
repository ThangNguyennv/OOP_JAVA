package hus.oop.libraby;

public class Book extends Item{
    int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book[" + "pages=" + pages + ", title=" + "\"" + super.getTitle() + "\"" + ", year=" + super.getYear() + "]";
    }
}
