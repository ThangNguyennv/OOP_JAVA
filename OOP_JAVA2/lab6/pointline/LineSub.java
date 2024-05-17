package lab6.pointline;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX,int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setBeginXY(int x, int y) {
        super.setX(x);
        super.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    public int getLength() {
        double xDiff = super.getX() - end.getX();
        double ydiff = super.getY() - end.getY();
        return (int)Math.sqrt(xDiff*xDiff + ydiff*ydiff);
    }

    public double getGradient() {
        double xDiff = super.getX() - end.getX();
        double ydiff = super.getY() - end.getY();
        return Math.atan2(ydiff, xDiff);
    }

    public String toString() {
        return "Line[begin=" + super.toString() + ",end=" + end.toString() + "]";
    }
}
