package lab1;
import java.util.*;
public class Bai3_4 {
    public static void fibonacci1(){
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");
        while(n <= nMax){
            fn = fnMinus1 + fnMinus2;
            sum += fn;
            System.out.print(fn + " ");
            n++;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        average = sum*1.0 / nMax;
        System.out.println();
        System.out.println("The average is " + average);
        
    }
    public static void fibonacci2(){
        int n = 4;
        int fn;
        int fnMinus1 = 1; //f3
        int fnMinus2 = 1; //f2
        int fnMinus3 = 2; //f1
        int nMax = 20;
        int sum = fnMinus1 + fnMinus2 + fnMinus3;
        double average;
        System.out.println("The first " + nMax + " Fibonacci numbers are: ");
        System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");
        while(n <= nMax){
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            sum += fn;
            System.out.print(fn + " ");
            ++n;
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
        }
        average = sum*1.0 / nMax;
        System.out.println();
        System.out.println("The average is " + average);
        
    }



    public static void main(String[] args) {
        fibonacci1();
        fibonacci2();
    }
}
