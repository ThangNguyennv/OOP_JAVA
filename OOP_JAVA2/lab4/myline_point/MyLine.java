package lab4.myline_point;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1,int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public double getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public double getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public double getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public double getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        int result[] = new int[2];
        result[0] = (int) begin.getX();
        result[1] = (int) begin.getY();
        return result;
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getEndXY() {
        int result[] = new int[2];
        result[0] = (int) end.getX();
        result[1] = (int) end.getY();
        return result;
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        double xDiff = begin.getX() - end.getX();
        double ydiff = begin.getY() - end.getY();
        return Math.atan2(ydiff, xDiff);
    }

    public String toString() {
        return "MyLine[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }
}
