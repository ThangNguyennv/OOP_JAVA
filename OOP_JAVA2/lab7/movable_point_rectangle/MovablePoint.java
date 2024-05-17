package lab7.movable_point_rectangle;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ") speed=(" + this.xSpeed + "," + this.ySpeed + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp(){
        this.y -= this.ySpeed;
    }

    @Override
    public void moveDown(){
        this.y += this.ySpeed;
    }

    @Override
    public void moveLeft(){
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight(){
        this.x += this.xSpeed;
    }

    
}
