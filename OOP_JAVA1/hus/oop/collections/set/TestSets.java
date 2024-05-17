package hus.oop.collections.set;

import java.util.*;
public class TestSets {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);

        List<Integer> first_Set = new ArrayList<>();
        first_Set.add(1);
        first_Set.add(2);
        first_Set.add(2);
        first_Set.add(3);
        first_Set.add(5);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(2);
        secondSet.add(3);
        secondSet.add(4);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(15);

        // Gọi các phương thức từ lớp Sets để thử nghiệm
        System.out.println("Intersection Manual: " + Sets.intersectionManual(firstSet, secondSet));
        System.out.println("Union Manual: " + Sets.unionManual(firstSet, secondSet));
        System.out.println("Intersection: " + Sets.intersection(firstSet, secondSet));
        System.out.println("Union: " + Sets.union(firstSet, secondSet));
        System.out.println("To List: " + Sets.toList(firstSet));
        System.out.println("Remove Duplicates Manual: " + Sets.removeDuplicatesManual(first_Set));
        System.out.println("Remove Duplicates: " + Sets.removeDuplicates(first_Set));
        System.out.println("First Recurring Character: " + Sets.firstRecurringCharacter("abcdefa"));
        System.out.println("All Recurring Chars: " + Sets.allRecurringChars("abcdefa"));
        System.out.println("To Array: " + Arrays.toString(Sets.toArray(firstSet)));
        System.out.println("Get First: " + Sets.getFirst(treeSet));
        System.out.println("Get Last: " + Sets.getLast(treeSet));
        System.out.println("Get Greater: " + Sets.getGreater(treeSet, 5));
    }
}