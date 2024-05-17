package lab7.movable_point_circle;

public class TestMain {
    public static void main(String[] args) {
        Movable movablePoint1 = new MovablePoint(1, 2, 3, 4); // Upcast
        System.out.println(movablePoint1);
        if(movablePoint1 instanceof MovablePoint){
            System.out.println(((MovablePoint)movablePoint1).getX());
            System.out.println(((MovablePoint)movablePoint1).getY());
            System.out.println(((MovablePoint)movablePoint1).getxSpeed());
            System.out.println(((MovablePoint)movablePoint1).getySpeed());
        }

        MovablePoint movablePoint2 = (MovablePoint)movablePoint1; // Downcast
        System.out.println(movablePoint2);
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
        System.out.println(movablePoint2.getxSpeed());
        System.out.println(movablePoint2.getySpeed());

        movablePoint1.moveUp();
        System.out.println(movablePoint1);
        movablePoint1.moveDown();
        System.out.println(movablePoint1);
        movablePoint1.moveLeft();
        System.out.println(movablePoint1);
        movablePoint1.moveRight();

        Movable movableCircle1 = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println(movableCircle1);
        movableCircle1.moveUp();
        System.out.println(movableCircle1);
        movableCircle1.moveDown();
        System.out.println(movableCircle1);
        movableCircle1.moveLeft();
        System.out.println(movableCircle1);
        movableCircle1.moveRight();
        System.out.println(movableCircle1);
    }
}
