package lab7.geometricobject_resizable;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }

    public String toString(){
        return "ResizableCircle[" + super.toString() + "]";
    }

    public void resize(int percent){
        radius *= percent / 100.0;
    }
}
