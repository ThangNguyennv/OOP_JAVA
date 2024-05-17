package lab7.movable_point_rectangle;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "MovableRectangle[" + "topLeft=" + this.topLeft + ",bottomRight=" + this.bottomRight + ']';
    }

    @Override
    public void moveUp(){
        this.topLeft.setY(this.topLeft.getY() - this.topLeft.getySpeed());
        this.bottomRight.setY(this.bottomRight.getY() - this.bottomRight.getySpeed());
    }

    @Override
    public void moveDown(){
        this.topLeft.setY(this.topLeft.getY() + this.topLeft.getySpeed());
        this.bottomRight.setY(this.bottomRight.getY() + this.bottomRight.getySpeed());
    }

    @Override
    public void moveLeft(){
        this.topLeft.setX(this.topLeft.getX() - this.topLeft.getxSpeed());
        this.bottomRight.setX(this.bottomRight.getX() - this.bottomRight.getxSpeed());
    }

    @Override
    public void moveRight(){
        this.topLeft.setX(this.topLeft.getX() + this.topLeft.getxSpeed());
        this.bottomRight.setX(this.bottomRight.getX() + this.bottomRight.getxSpeed());
    }
}
