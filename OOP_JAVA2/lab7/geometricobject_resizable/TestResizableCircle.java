package lab7.geometricobject_resizable;

public class TestResizableCircle {
    public static void main(String[] args) {
        Resizable resizablecircle1 = new ResizableCircle(3.0); // Upcast
        System.out.println(resizablecircle1);
        resizablecircle1.resize(30);
        System.out.println(resizablecircle1);

        GeometricObject resizablecircle2 = (GeometricObject)resizablecircle1;
        System.out.println(resizablecircle2);
        System.out.println(resizablecircle2.getArea());
        System.out.println(resizablecircle2.getPerimeter());

       

    }
}
