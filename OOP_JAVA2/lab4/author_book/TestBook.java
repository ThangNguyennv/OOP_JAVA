package lab4.author_book;

public class TestBook {
    public static void main(String[] args) {
        // Test constructor
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        System.out.println(ahTeck); // Test toString();

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99); // Test Book's Constructor
        System.out.println(dummyBook);

        //Test getters and setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor()); //Author's toString()

        // System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        // System.out.println("Author's email is: "  + dummyBook.getAuthor().getEmail());

        System.out.println("Author's name is: " + dummyBook.getAuthorName());
        System.out.println("Author's email is: "  + dummyBook.getAuthorEmail());

        // Use an anonymous instance of Author to construct a Book instance;
        Book anotherBook = new Book("more Java", new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'), 29.95);
        System.out.println(anotherBook);

    }
}
