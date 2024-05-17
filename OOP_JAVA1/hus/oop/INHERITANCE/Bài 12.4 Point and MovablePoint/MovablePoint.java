public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public MovablePoint() {
        
    }
    
    public float getXSpeed() {
        return this.xSpeed;
    }
    
    public void setXSpeed(float xSPeed) {
        this.xSpeed = xSpeed;
    }
    
    public float getYSpeed() {
        return this.ySpeed;
    }
    
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    
    public void setPeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    
    public float[] getSpeed() {
        float[] fl = new float[2];
        fl[0] = this.xSpeed;
        fl[1] = this.ySpeed;
        return fl;
    }
    
    public String toString() {
        return super.toString() + ",speed=(" + this.xSpeed + "," + this.ySpeed + ")";
    }
    
    public MovablePoint move() {
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }
}