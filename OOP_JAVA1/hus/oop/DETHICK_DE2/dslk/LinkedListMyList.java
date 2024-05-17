package dslk;

public class LinkedListMyList extends AbstractMyList {
    private Node head;
    private int size;

    public LinkedListMyList() {
        head = null;
        size = 0;
    }

    @Override
    public void append(int value) {
        insert(size, value);
    }

    @Override
    public int get(int index) {
        Node node = getNodeByIndex(index);
        return node.getData();
    }

    public Node getNodeByIndex(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void insert(int index, int value) {
        if (!checkBoundaries(index, size)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = new Node(value, head);
        } else {
            Node current = getNodeByIndex(index - 1);
            current.setNext(new Node(value, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            Node prev = getNodeByIndex(index - 1);
            Node current = prev.getNext();
            prev.setNext(current.getNext());
        }
        size--;
    }

    @Override
    public void set(int index, int value) {
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        Node node = getNodeByIndex(index);
        node.setData(value);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        Node current = head;
        int index = 0;
        while (current != null) {
            result[index++] = current.getData();
            current = current.getNext();
        }
        return result;
    }
}
