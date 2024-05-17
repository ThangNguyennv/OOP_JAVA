package lab7.geometricobject;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle(3.0);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        GeometricObject rectangle1 = new Rectangle(2,3);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());

    }
}
