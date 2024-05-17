package lab1;
import java.util.*;
public class Bai3_5 {
    public static void extractDigits(int n){
        while(n > 0){
            int digit = n % 10;
            System.out.print(digit + " ");
            n /= 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        extractDigits(n);
    }
}
