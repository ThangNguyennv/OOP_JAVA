package dslk;
import java.util.*;
public class MyStack {
    private MyList stackData;

    public MyStack() {
        stackData = new LinkedListMyList();
    }


    public boolean isEmpty() {
        return stackData.size() == 0;
    }

    public int peek() {
        int value = stackData.get(size() - 1);
        return value;
    }

    public int pop() {
        int value = stackData.get(size() - 1);
        stackData.remove(size() - 1);
        return value;
    }

    public void push(int value) {
        stackData.append(value);
    }

    public int size() {
        return stackData.size();
    }
}
