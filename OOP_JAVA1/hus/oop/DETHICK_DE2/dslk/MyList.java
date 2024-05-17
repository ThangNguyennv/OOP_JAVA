package dslk;

public interface MyList {
    void append(int value);

    int get(int index);

    void insert(int index, int value);

    void remove(int index);

    void set(int index, int value);

    int size();

    int[] toArray();
}
