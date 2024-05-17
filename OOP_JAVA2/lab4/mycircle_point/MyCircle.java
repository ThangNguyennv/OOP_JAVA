package lab4.mycircle_point;

public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {

    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        int result[] = new int[2];
        result[0] = center.getX();
        result[1] = center.getY();
        return result;
    }

    public void setCenterXY(int x, int y) {
            center.setXY(x,y);
    }

    public String toString() {
        return "MyCircle[radius=" + this.radius + ",center="
                + center.toString() + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }
}