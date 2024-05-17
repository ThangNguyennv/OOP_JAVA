package hus.oop.collections.list;

import java.util.*;

public class TestLists {
    public static void main(String[] args) {
        // Kiểm tra phương thức insertFirst
        List<Integer> list1 = new ArrayList<>();
        Lists.insertFirst(list1, 10);
        System.out.println("List sau khi chèn vào đầu: " + list1);

        // Kiểm tra phương thức insertLast
        List<Integer> list2 = new ArrayList<>();
        Lists.insertLast(list2, 20);
        System.out.println("List sau khi chèn vào cuối: " + list2);

        // Kiểm tra phương thức replace
        List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3));
        Lists.replace(list3, 99);
        System.out.println("List sau khi thay thế phần tử thứ 2: " + list3);

        // Kiểm tra phương thức removeThird
        List<Integer> list4 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Lists.removeThird(list4);
        System.out.println("List sau khi loại bỏ phần tử thứ 3: " + list4);

        // Kiểm tra phương thức removeEvil
        List<Integer> list5 = new ArrayList<>(List.of(666, 1, 2, 666, 3));
        Lists.removeEvil(list5);
        System.out.println("List sau khi loại bỏ số 666: " + list5);

        // Kiểm tra phương thức generateSquare
        List<Integer> squares = Lists.generateSquare();
        System.out.println("List chứa các số bình phương từ 1 đến 10: " + squares);

        // Kiểm tra phương thức contains
        List<Integer> list6 = new ArrayList<>(List.of(1, 2, 3));
        boolean contains2 = Lists.contains(list6, 2);
        System.out.println("List có chứa số 2 không? " + contains2);

        // Kiểm tra phương thức copy
        List<Integer> source = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> target = new ArrayList<>();
        Lists.copy(source, target);
        System.out.println("List target sau khi copy từ source: " + target);

        // Kiểm tra phương thức reverse
        List<Integer> list7 = new ArrayList<>(List.of(1, 2, 3));
        Lists.reverse(list7);
        System.out.println("List sau khi đảo ngược: " + list7);

        // Kiểm tra phương thức reverseManual
        List<Integer> list8 = new ArrayList<>(List.of(1, 2, 3));
        Lists.reverseManual(list8);
        System.out.println("List sau khi đảo ngược bằng cách thủ công: " + list8);

        // Kiểm tra phương thức insertBeginningEnd
        LinkedList<Integer> list9 = new LinkedList<>();
        Lists.insertBeginningEnd(list9, 5);
        System.out.println("List sau khi chèn vào đầu và cuối: " + list9);
    }
}