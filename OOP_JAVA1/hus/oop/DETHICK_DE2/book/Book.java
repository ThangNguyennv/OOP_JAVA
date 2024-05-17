package book;
public class Book implements MyBookComparable{
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;
    private String publisher;

    public Book(String title, String author, String genre, int pages, double price, String publisher) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.price = price;
        this.publisher = publisher;
    }

    public int compareTo(Book book) {
        return book.pages - this.pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", genre=" + genre + ", pages=" + pages + ", price="
                + price + ", publisher=" + publisher + "]";
    }
}
