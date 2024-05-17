package lab4.mycircle_point;


public class TestMyCircle {
    public static void main(String[] args) {
        // Tạo đối tượng MyCircle
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(new MyPoint(3, 4), 5);

        // Kiểm tra các phương thức getter và setter
        System.out.println("Circle 1: Radius = " + circle1.getRadius() + ", Center = " + circle1.getCenter());
        System.out.println("Circle 2: Radius = " + circle2.getRadius() + ", Center = " + circle2.getCenter());

        // Kiểm tra các phương thức tính toán
        System.out.println("Circle 1: Area = " + circle1.getArea());
        System.out.println("Circle 2: Circumference = " + circle2.getCircumference());

        // Kiểm tra phương thức distance
        System.out.println("Distance between Circle 1 and Circle 2 = " + circle1.distance(circle2));
    }
}