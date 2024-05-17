package lab1;
import java.util.*;
public class Bai4_5 {
    public static void reverseInt(int number){
        while(number > 0){
            System.out.print("The reverse is: " + number%10);
            number/=10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        reverseInt(number);


    }
}
