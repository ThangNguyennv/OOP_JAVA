package lab1;
import java.util.*;
public class Bai4_2 {
    public static void circleComputation(double radius){
        double diameter = 2.0 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f\n", diameter);
        System.out.printf("Area is: %.2f\n", area);
        System.out.printf("Circumference is: %.2f\n", circumference);
    }

    public static void sphereComputation(double radius){
        double surfaceAre = 4.0 * Math.PI * radius * radius;
        double volume = (4.0/3) * Math.PI * radius * radius * radius;
        System.out.printf("SurfaceArea is: %.2f\n", surfaceAre);
        System.out.printf("Volume is: %.2f\n", volume);
    }

    public static void cylinderComputation(double radius, int height){
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 2.0*Math.PI*radius + 2.0*baseArea;
        double volume = baseArea*height*1.0;
        System.out.printf("BaseArea is: %.2f\n", baseArea);
        System.out.printf("SurfaceArea is: %.2f\n", surfaceArea);
        System.out.printf("Volume is: %.2f\n", volume);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        circleComputation(radius);
        sphereComputation(radius);
        int height = sc.nextInt();
        cylinderComputation(radius, height);
    }
}
