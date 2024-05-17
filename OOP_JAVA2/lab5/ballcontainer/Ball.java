package lab5.ballcontainer;

public class Ball {
    private float x; // Tọa độ x của quả bóng
    private float y; // Tọa độ y của quá bóng
    private int radius; // Bán kính quả bóng
    private float xDelta; // Tốc độ di chuyển theo trục x
    private float yDelta; // Tốc độ di chuyển theo trục y

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal(){ // Phản xạ quả bóng khi va chạm cạnh ngang
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical(){ // Phản xạ quả bóng khi va chạm cạnh dọc
        this.yDelta = -this.yDelta;
    }

    public String toString(){
        return "Ball[(" + this.x + "," + this.y + "),speed=(" + this.xDelta + "," + this.yDelta + ")]";
    }

    
}
