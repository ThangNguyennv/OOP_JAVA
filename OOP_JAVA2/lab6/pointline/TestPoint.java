package lab6.pointline;

public class TestPoint {
    public static void main(String [] args){
        Point point1 = new Point(2,3);
        System.out.println("Tọa độ điểm 1: " + point1);
        point1.setXY(4,5);
        System.out.println("Tọa độ sau khi thay đổi x và y: " + point1);
        System.out.println("Điểm x: " + point1.getX());
        System.out.println("Điểm y: " + point1.getY());
    }
}
