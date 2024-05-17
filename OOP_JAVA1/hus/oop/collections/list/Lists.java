package hus.oop.collections.list;

import java.util.*;
public class Lists {
    public static void insertFirst(List<Integer> list, int value){
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value){
        list.add(value);
    }
    
    public static void replace(List<Integer> list, int value){
        if(list.size() >= 3) {
            list.set(2, value);
        }
    }

    public static void removeThird(List<Integer> list){
        if (list.size() >= 3) {
            list.remove(2);
        }
    }

    public static void removeEvil(List<Integer> list){
        list.removeIf(element -> element == 666);
    }

    public static List<Integer> generateSquare(){
        List<Integer> squareList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            squareList.add(i * i);
        }
        return squareList;
    }

    public static boolean contains(List<Integer> list, int value){
        if(list.contains(value)){
            return true;
        } else{
            return false;
        }
    }

    public static void copy(List<Integer> source, List<Integer> target){
        target.clear();
        for(Integer element : source){
            target.add(element);
        }
    }

    public static void reverse(List<Integer> list){
        list.reversed();
    }

    public static void reverseManual(List<Integer> list){
        for(int i = 0; i < list.size(); i++){
            Integer temp = list.get(i);
            list.set(i, list.get(list.size()-i-1));
            list.set(list.size()-i-1, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value){
        list.addFirst(value);
        list.addLast(value);
    }
}


