package lab5.ballcontainer;

public class Container {
    private int x1; // Tọa độ x của góc trái trên của khối chứa
    private int y1; // Tọa độ y của góc trái trên của khối chứa
    private int x2; // Tọa độ x của góc phải dưới của khối chứa
    private int y2; // Tọa độ y của góc phải dưới của khối chứa

    public Container(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX(){
        return this.x1;
    }

    public int getY(){
        return this.y1;
    }

    public int getWidth(){
        return this.x2 - this.x1 + 1;
    }

    public int getHeight(){
        return this.y2 - this.y1 + 1;
    }

    // Kiểm tra xem bóng có va chạm với cạnh ngang hay dọc của khối chứa hay không?
    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() - ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }

    public String toString(){
        return "Container[()" + this.x1 + "," + this.y1 + "),(" + this.x2 + "," + this.y2 + ")]";
    }

    
}
