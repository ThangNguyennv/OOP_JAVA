package lab1;

import java.util.*;
public class Bai1_1 {
    public static long factorial(long n) {
        long factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("The Factorial of " + n + " is " + factorial(n));
    }
}
