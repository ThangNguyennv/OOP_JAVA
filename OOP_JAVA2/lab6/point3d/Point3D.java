package lab6.point3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public Point3D() {
        z = 0.0f;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] fl = new float[3];
        fl[0] = super.getX();
        fl[1] = super.getY();
        fl[2] = this.z;
        return fl;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }



}
