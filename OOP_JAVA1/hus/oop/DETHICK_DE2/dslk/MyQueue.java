package dslk;

public class MyQueue {
    private MyList queueData;

    public MyQueue() {
        queueData = new LinkedListMyList();
    }

    public void add(int value) {
        queueData.append(value);
    }

    public boolean isEmty() {
        return queueData.size() == 0;
    }

    public int peek() {
        int value = queueData.get(0);
        return value;
    }

    public int remove() {
        int value = queueData.get(0);
        queueData.remove(0);
        return value;
    }

    public int size() {
        return queueData.size();
    }
}
