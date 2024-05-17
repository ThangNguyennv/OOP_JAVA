package lab6.point3d;

public class MovablePoint extends Point3D {
    private float xSpeed;
    private float ySpeed;
    private float zSpeed;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed, float zSpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.zSpeed = zSpeed;
    }

    public MovablePoint(float x, float y, float z, float xSpeed, float ySpeed, float zSpeed) {
        super(x, y, z);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.zSpeed = zSpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getzSpeed() {
        return zSpeed;
    }

    public void setzSpeed(float zSpeed) {
        this.zSpeed = zSpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed, float zSpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.zSpeed = zSpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed, zSpeed};
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.getZ() + "),speed=" + "(" + xSpeed + "," + ySpeed + "," + zSpeed + ")";
    }

    public MovablePoint move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        this.setZ(this.getZ() + this.zSpeed);
        return this;
    }
}