package lab2_HomeWork;
import java.util.*;
public class MathLibraryHomework {
    static Scanner sc = new Scanner(System.in);

    //bai5.1
    public static double sin(double x, int numTerms){
        double Sk = x;
        double sin = x;
        for(int k = 2; k <= numTerms; k++){
            Sk = (Sk*(-1) * x * x) / ((2*k-1)*(2*k-2));
            sin = sin + Sk;
        }
        return sin;
    }
    public static double cos(double x, int numTerms){
        double Sk = x;
        double cos = x;
        for(int k = 2; k <= numTerms; k++){
            Sk = (Sk*(-1) * x * x) / ((2*k+1)*(2*k+2));
            cos = cos + Sk;
        }
        return cos;
    }
    public static void testSinAndCos(){
        double x = Double.parseDouble(sc.nextLine());
        int numTerms = sc.nextInt();
        System.out.println(sin(x, numTerms));
        System.out.println(cos(x, numTerms));
    }

    //bai5.3
    public static int factorial(int number){
        int result = 1;
        for (int i=1;i <= number;i++){
            result *= i;
        }
        return result;
    }
    public static void factorialInt(){
        int number =1;
        while (true){
            System.out.println("The factorial of "+ number +" is "+factorial(number));
            if((Integer.MAX_VALUE/factorial(number)) < (number+1)){
                break;
            }
            number++;
        }
        System.out.println("The factorial of "+ (number+1) +" is out of range");
    }

    //bai5.4

    public static void printFibonacci(int n) {
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second);
        int next;
        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(" " + next);

            first = second;
            second = next;
        }
    }
    public static void fibonacciInt() {
        
    }
    public static void main(String[] args) {
        testSinAndCos();
        factorialInt();
    }
}
