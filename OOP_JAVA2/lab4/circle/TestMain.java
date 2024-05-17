package lab4.circle;
public class TestMain{
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle circle1 = new Circle(1.1);
        System.out.println(circle1); //toString()
        Circle circle2 = new Circle(); // default constructor
        System.out.println(circle2);

        // Test setter and getter
        circle1.setRadius(2.2);
        System.out.println(circle1); // toString()
        System.out.println("radius is: " + circle1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());

    }
}