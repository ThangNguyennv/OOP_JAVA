package lab4.myline_point;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line1 = new MyLine(0, 0, 1, 1);
        // MyLine line2 = new MyLine(new MyPoint(0, 0), new MyPoint(1, 1));

        // Test getter and setter methods
        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());
        line1.setBegin(new MyPoint(2, 2));
        line1.setEnd(new MyPoint(3, 3));
        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());

        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        line1.setBeginX(4);
        line1.setBeginY(4);
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());

        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());
        line1.setEndX(5);
        line1.setEndY(5);
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        // Test other methods
        line1.setBeginXY(6, 6);
        line1.setEndXY(7, 7);

        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        System.out.println("ToString: " + line1.toString());
    }
}
