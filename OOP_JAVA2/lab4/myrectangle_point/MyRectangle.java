package lab4.myrectangle_point;

class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft = " + topLeft + ", bottomRight = " + bottomRight + "]";
    }

    public double getPerimeter() {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();

        return 2 * (width + height);
    }

    public double getArea() {
        double width = bottomRight.getX() - topLeft.getX();
        double height = topLeft.getY() - bottomRight.getY();

        return width * height;
    }
}


