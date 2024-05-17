package lab1;
import java.util.*;
public class Bai3_1 {
    public static void sumAverageRunningInt(int LOWERBOUND, int UPPERBOUND){
       double sum = 0; double average;
       int cnt = 0;
       for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
           sum += i;
           cnt++;
       }
       average = sum / cnt;
       System.out.println("The sum of " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
       System.out.println("The average is " + average);

    }

    public static void sumOfTheSquares(int LOWERBOUND, int UPPERBOUND){
        double sum = 0; 
        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
            sum += i*i;
        }
        System.out.println("The sum of the squares " + sum);
 
    }

    public static void sumOfTheNumber(int LOWERBOUND, int UPPERBOUND){
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for(int i = LOWERBOUND; i <= UPPERBOUND; i++){
            if(i % 2 == 0){
                sumEven += i;
            }
            else {
                sumOdd += i;
            }
        }
        System.out.println("The sum of odd numbers : " + sumEven);
        System.out.println("The sum of even numbers : " + sumOdd);
        System.out.println(absDiff = (sumOdd > sumEven) ? Math.abs(sumOdd-sumEven) : Math.abs(sumEven - sumOdd));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LOWERBOUND = sc.nextInt();
        final int UPPERBOUND = sc.nextInt();
        sumAverageRunningInt(LOWERBOUND, UPPERBOUND);
        sumOfTheSquares(LOWERBOUND, UPPERBOUND);
        sumOfTheNumber(LOWERBOUND, UPPERBOUND);
    }
}
