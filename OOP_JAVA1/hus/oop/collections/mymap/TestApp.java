package hus.oop.collections.mymap;

public class TestApp {
    public static void main(String[] args) {
        MyMap m = new MyHashMap();
        m.put("Nicola", 11);
        m.put("Marzia", 21);
        m.put("Agata", 33);
        m.remove("Nicola");
        // System.out.println(m.contains(11));
        // System.out.println(m.contains(77));
        // System.out.println(m.size());
        System.out.println(m);
    }
}
