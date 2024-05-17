package lab2_HomeWork;
import java.util.*;
public class ArrayHomework {
    static Scanner sc = new Scanner(System.in);
    public static void printArrayStars(Scanner in){
        System.out.print("Enter the number of items: ");
        int number = in.nextInt();
        int arr[] = new int[number];
        System.out.print("Enter the value of all items (separated by space): ");
        for(int idx = 0; idx < number; idx++){
            arr[idx] = in.nextInt();
        }
        for(int idxArr = 0; idxArr < number; idxArr++){
            System.out.print(idxArr + ": ");
            for(int idx = 0; idx < arr[idxArr]; idx++){
                System.out.print("*");
            }
            System.out.println("(" + arr[idxArr] + ")");
        }
    }
    public static void main(String[] args) {
        printArrayStars(sc);
    }
}
