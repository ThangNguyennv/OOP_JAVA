package hus.oop.collections.map;

import java.util.*;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);

        System.out.println("Number of elements in map: " + Maps.count(map));

        System.out.println("Is map empty? " + map.isEmpty());

        System.out.println("Does map contain key 2? " + Maps.contains(map, 2));
        System.out.println("Does map contain key 4? " + Maps.contains(map, 4));

        System.out.println("Does map contain key-value pair (2, 20)? " + Maps.containsKeyValue(map, 2, 20));
        System.out.println("Does map contain key-value pair (3, 40)? " + Maps.containsKeyValue(map, 3, 40));

        Set<Integer> keySet = Maps.keySet(map);
        System.out.println("Keys in map: " + keySet);

        Collection<Integer> values = Maps.values(map);
        System.out.println("Values in map: " + values);

        int colorCode = 2;
        String color = Maps.getColor(colorCode);
        System.out.println("Color for code " + colorCode + ": " + color);
    }
}