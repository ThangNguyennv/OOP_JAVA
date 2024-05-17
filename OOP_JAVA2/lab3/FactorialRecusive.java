package lab3;
import java.util.*;
public class FactorialRecusive {

    static Scanner sc = new Scanner(System.in);
    //bai1.1
    public static int factorial(int n){
        if(n == 0)
            return 1;
        return n * factorial(n-1);
    }
    public static void testFactorial(){
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        for(int i = 0; i <= number; i++){
            System.out.println("factorial(" + i + ") = " + factorial(i));

        }
    }

    //bai1.2
    public static int fibonacci(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void testFibonacci(){
        System.out.print("Enter the number: ");
        int number = sc.nextInt();    
        for(int i = 0; i <= number; i++){
            System.out.println("F(" + i + ") = " + fibonacci(i) + " ");

        }   
    }

    //bai1.3
    public static String len(int n){
        if (n == 1)
            return "1";
        return len(n-1) + String.valueOf(n);
    }
    public static void testLen(){
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("S(" + i + ") = " + len(i));
        }
    }

    //bai1.4
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    public static void testGcd(){
        System.out.print("Enter the first number: ");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the second number: ");
        int seconNum = sc.nextInt();
        System.out.println("GCD of the two number " + firstNum + " and " + seconNum + " is: " + gcd(firstNum, seconNum));
    }

    public static void main(String[] args) {
        testFactorial();
        testFibonacci();   
        testGcd();   
        testLen();  
    }


}
