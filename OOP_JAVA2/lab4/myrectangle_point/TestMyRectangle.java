package lab4.myrectangle_point;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(0, 0, 3, 4);
        MyRectangle rectangle2 = new MyRectangle(new MyPoint(0, 0), new MyPoint(3, 4));

        System.out.println("Rectangle 1: " + rectangle1);
        System.out.println("Rectangle 2: " + rectangle2);

        System.out.println("Perimeter of Rectangle 1: " + rectangle1.getPerimeter());
        System.out.println("Perimeter of Rectangle 2: " + rectangle2.getPerimeter());

        System.out.println("Area of Rectangle 1: " + rectangle1.getArea());
        System.out.println("Area of Rectangle 2: " + rectangle2.getArea());
    }
}