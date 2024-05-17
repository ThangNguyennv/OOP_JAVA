package lab7.movable_point_circle;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return center.toString() + ",radius=" + this.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public void moveUp(){
        this.center.setY(this.center.getY() - this.center.getySpeed());
    }

    @Override
    public void moveDown(){
        this.center.setY(this.center.getY() + this.center.getySpeed());
    }

    @Override
    public void moveLeft(){
        this.center.setX(this.center.getX() - this.center.getxSpeed());
    }

    @Override
    public void moveRight(){
        this.center.setX(this.center.getX() + this.center.getxSpeed());
    }
}
