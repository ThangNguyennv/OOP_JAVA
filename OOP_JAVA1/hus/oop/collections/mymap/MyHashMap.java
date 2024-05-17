package hus.oop.collections.mymap;

public class MyHashMap implements MyMap {
    private final static int INITIAL_SIZE = 8;
    private MyHashMapEntry[] table;
    private int size;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
        size = 0;
    }

    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int temp = -1;
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null && table[i].getKey().equals(key)) {
                temp = i;
                break;
            }
        }
        if (temp != -1) {
            for (int i = temp; i < size - 1; i++) {
                table[i] = table[i + 1];
            }
            table[size - 1] = null;
            size--;
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < table.length; i++) {
            MyHashMapEntry entry = table[i];
            while (entry != null) {
                if (entry.getValue().equals(o)) {
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return  sb.toString();
    }
    
    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio() {
        return size / (double)table.length;
    }

    void enlarge() {
        MyHashMapEntry[] tmp = new MyHashMapEntry[table.length * 2];
        System.arraycopy(table, 0, tmp, 0, table.length);
        table = tmp;
    }
    
}
