package lab6.point3d;

public class TestPoint3D {
    public static void main(String[] args){
        MovablePoint movablepoint3d = new MovablePoint(1,2,3,3,4,5);
        System.out.println("Initial position: " + movablepoint3d);
        movablepoint3d.move();
        System.out.println("After moving: " + movablepoint3d);

        movablepoint3d.setSpeed(5,6,7);
        movablepoint3d.move();
        System.out.println("After changing Speed and moving: " + movablepoint3d);

        movablepoint3d.setXYZ(2,3,4);
        movablepoint3d.setxSpeed(5);
        movablepoint3d.setySpeed(6);
        movablepoint3d.setzSpeed(7);
        System.out.println(movablepoint3d.getX());
        System.out.println(movablepoint3d.getY());
        System.out.println(movablepoint3d.getZ());
        System.out.println(movablepoint3d.getZ());
        System.out.println(movablepoint3d.getxSpeed());
        System.out.println(movablepoint3d.getySpeed());
        System.out.println(movablepoint3d.getzSpeed());
    }
}
