package lab7.shape_abstract;

public class TestMain {
    public static void main(String[] args) {
        // Tự động ép kiểu Circle lên Shape(Upcast)
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1); // Tra ve ham con
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        // Ép kiểu Shape xuống Circle để gọi đc phương thức trong Circle
        if(shape1 instanceof Circle){
            System.out.println(((Circle)shape1).getRadius()); 
        }

        Circle circle1 = (Circle)shape1; // Downcast
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        // Tự động ép kiểu Rectangle lên Shape(Upcast)
        Shape shape2 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(shape2);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());
        // ÉP kiểu Rectangle xuống Shape để gọi đc phương thức trong Rectangle
        if(shape2 instanceof Rectangle){
            System.out.println(((Rectangle)shape2).getLength());
            System.out.println(((Rectangle)shape2).getWidth());
        }

        Rectangle rectangle1 = (Rectangle)shape2; // Downcast
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());

        // Tự động ép kiểu Shape lên Square(Upcast)
        Shape shape3 = new Square(6.6);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());
        if(shape3 instanceof Square){
            System.out.println(((Square)shape3).getSide());
        }

        Rectangle rectangle2 = (Rectangle)shape3; // Downcast to Rectangle
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
        System.out.println(rectangle2.getColor());
        if(rectangle2 instanceof Square){
            System.out.println(((Square)shape3).getSide());
        }
        System.out.println(rectangle2.getLength());

        Square square1 = (Square)rectangle2; // Downcast to Square
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getPerimeter());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());



    }
}
