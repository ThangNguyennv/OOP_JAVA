package lab6.pointline;

public class TestLine{
    public static void main(String[] args){
        Line line1 = new Line(0,0,3,4);
        System.out.println(line1);

        // Truy cập và in thông tin về các điểm bắt đầu và kết thúc của line1
        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());

        // Thiết lập tọa độ mới cho điểm bắt đầu và kết thúc của line1
        line1.setBegin(new Point(1,2));
        line1.setEnd(new Point(6,7));
        System.out.println("Updated Line 1: " + line1);

         // Truy cập và in thông tin về các tọa độ của line1
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        // Thiết lập tọa độ mới cho các điểm bắt đầu và kết thúc của line1
        line1.setBeginXY(2, 3);
        line1.setEndXY(5, 7);
        System.out.println("Update Line 1: " + line1);

        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());
    }
}