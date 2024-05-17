package dslk;

public class ArrayMyList extends AbstractMyList {
    private static final int DEFAULT_CAPACITY = 16;
    private double[] data;
    private int size;

    public ArrayMyList() {
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public void allocateMore() {
        double[] tmp = new double[2 * data.length];
        System.arraycopy(data, 0, tmp, 0, data.length);
        data = tmp;
    }

    @Override
    public void append(int value) {
        if (size >= data.length - 1) {
            allocateMore();
        }
        data[size++] = value;
    }

    @Override
    public int get(int index) {
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        return (int) data[index];
    }

    @Override
    public void insert(int index, int value) {
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        if (size >= data.length - 1) {
            allocateMore();
        }
        for (int i = size; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
    }

    @Override
    public void remove(int index) {
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    @Override
    public void set(int index, int value) {
        if (!checkBoundaries(index, size - 1)) {
            throw new IndexOutOfBoundsException();
        }
        data[index] = value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) data[i];
        }
        return result;
    }
}
