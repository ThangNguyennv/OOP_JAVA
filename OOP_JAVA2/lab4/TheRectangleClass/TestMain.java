package lab4.TheRectangleClass;

public class TestMain {
    public static void main(String[] args) {
        // Test constructors and toString()
        Rectangle rectangle1 = new Rectangle(1.2f, 3.4f);
        System.out.println(rectangle1); //toString()
        Rectangle rectangle2 = new Rectangle(); // default constructor
        System.out.println(rectangle2);

        // Test setters and getters
        rectangle1.setLength(5.6f);
        rectangle1.setWidth(7.8f);
        System.out.println(rectangle1); //toString()
        System.out.println("length is: " + rectangle1.getLength());
        System.out.println("width is: " + rectangle1.getWidth());

        // Test getArea() and getPerimeter()
        System.out.printf("area is: %.2f%n", rectangle1.getArea());
        System.out.printf("perimeter is: %.2f%n", rectangle1.getPerimeter());

    }
}
