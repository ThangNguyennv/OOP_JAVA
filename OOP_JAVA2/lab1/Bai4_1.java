package lab1;
import java.util.*;
public class Bai4_1 {
    public static void sumProductMinMax3(Scanner sc){
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int sum = number1 + number2 + number3;
        int min = Math.min(Math.min(number1,number2), number3);
        int max = Math.max(Math.max(number1,number2), number3);
        long product = number1 * number2 *number3;
        System.out.println("The sum is: " + sum + "\nThe product is: " + product + "\nThe min is: " + min + "\nThe max is: " + max);
    }

    public static void sumProductMinMax5(Scanner sc){
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        int number5 = sc.nextInt();
        int min = number1;
        if(number2 < min){
            min = number2;
        }
        if(number3 < min){
            min = number3;
        }
        if(number4 < min){
            min = number4;
        }
        if(number5 < min){
            min = number5;
        }
        int max = number1;
        if(number2 > max){
            max = number2;
        }
        if(number3 > max){
            max = number3;
        }
        if(number4 > max){
            max = number4;
        }
        if(number5 > max){
            max = number5;
        }
        int sum = number1 + number2 + number3 + number4 + number5;
        long product = number1 * number2 *number3*number4*number5;
        System.out.println("The sum is: " + sum + "\nThe product is: " + product + "\nThe min is: " + min + "\nThe max is: " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumProductMinMax3(sc);
        sumProductMinMax5(sc);
    }
}
