package lab4.author_book;

public class TestAuthor {
    public static void main(String[] args) {
        // Test constructor
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

        System.out.println(ahTeck); // Test toString();
        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        // Test getter
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
