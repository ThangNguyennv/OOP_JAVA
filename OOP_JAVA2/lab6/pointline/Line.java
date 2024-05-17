package lab6.pointline;

public class Line {
    private Point begin;
    private Point end;

    public Line(int beginX,int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public int getLength() {
        double xDiff = begin.getX() - end.getX();
        double ydiff = begin.getY() - end.getY();
        return (int)Math.sqrt(xDiff*xDiff + ydiff*ydiff);
    }

    public double getGradient() {
        double xDiff = begin.getX() - end.getX();
        double ydiff = begin.getY() - end.getY();
        return Math.atan2(ydiff, xDiff);
    }

    public String toString() {
        return "Line[begin=" + begin.toString() + ",end=" + end.toString() + "]";
    }
}
