package lab4.mytriangle_point;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(0, 4));

        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Triangle 2: " + triangle2);

        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());

        System.out.println("Type of Triangle 1: " + triangle1.getType());
        System.out.println("Type of Triangle 2: " + triangle2.getType());
    }
}

