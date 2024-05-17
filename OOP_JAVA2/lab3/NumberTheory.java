package lab3;
import java.util.*;
public class NumberTheory {
    static Scanner sc = new Scanner(System.in);

    //bai3.1
    public static boolean isPerfect(int aPosInt){
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(aPosInt); i++){
            if(aPosInt % i == 0)
                sum += i + aPosInt/i;
        }
        return sum == aPosInt;
    }
    public static void printPerfect(int amount){
        for(int i = 6; i <= amount; i++){
            if(isPerfect(i) == true)
                System.out.print(i + " ");
        }
    }
    public static int countPerfect(int amount){
        int count = 0;
        for(int i = 6; i <= amount; i++){
            if(isPerfect(i) == true)
                count++;
        }
        return count;
    }
    public static boolean isDeficient(int aPosInt){
        int sum = 1;
        for(int i = 2; i < Math.sqrt(aPosInt); i++){
            if(aPosInt % i == 0)
                sum += i + aPosInt/i;
        }
        return sum < aPosInt;
    }
    
    public static int countNotDeficientAndPerfect(int amount){
        int count = 0;
        for(int i = 1; i <= amount; i++){
            if(isPerfect(i) == false && isDeficient(i) == false)
                count++;
        }
        return count;
    }
    public static void isNotPerfectAndDeficient(int amount){
        for(int i = 1; i <= amount; i++){
            if(isPerfect(i) == false && isDeficient(i) == false)                
                System.out.print(i + " ");
        }
    }
    public static void testPerfectAndDeficient(){
        System.out.print("Enter the upper bound: ");
        int amount = sc.nextInt();
        System.out.println("These numbers are perfect: ");
        printPerfect(amount);
        System.out.println();
        System.out.println("[" + countPerfect(amount) + " perfect numbers found (" + String.format("%.2f",(countPerfect(amount)*1.0*100)/amount) + "%)]");
        System.out.println("These numbers are neither deficient nor perfect:");
        isNotPerfectAndDeficient(amount);
        System.out.println();
        System.out.println("[" + countNotDeficientAndPerfect(amount) + " numbers found (" + String.format("%.2f", (countNotDeficientAndPerfect(amount)*1.0*100)/amount) + "%)]");
    }

    //bai3.2
    public static boolean isPrime(int aPosInt){
        for(int i = 2; i <= Math.sqrt(aPosInt); i++){
            if(aPosInt % i == 0)
                return false;
        }
        return true;
    }
    public static void primeList(int amount){
        for(int i = 1; i <= amount; i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static int countPrime(int amount){
        int count = 0;
        for(int i = 1; i <= amount; i++){
            if(isPrime(i))
                count++;
        }
        return count;
    }
    public static void testPrime(){
        System.out.print("Please enter the upper bound: ");
        int amount = sc.nextInt();
        primeList(amount);
        System.out.println("[" + countPrime(amount) + " primes found (" + String.format("%.2f", (countPrime(amount)*1.0*100)/amount) + "%)]");
    }

    //bai3.3
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        
        return product == aPosInt;
    }
    public static void perfectPrimeFactorList(int amount){
        for(int i = 6; i <= amount; i++){
            if(isProductOfPrimeFactors(i) == true)
                System.out.print(i + " ");
        }
    }
    public static int countPrimeFactor(int amount){
        int count = 0;
        for(int i = 6; i <= amount; i++){
            if(isProductOfPrimeFactors(i))
                count++;
        }
        return count;
    }
    public static void testPrimeFactor(){
        System.out.print("Enter the upper bound: ");
        int amount = sc.nextInt();
        System.out.println("These numbers are equal to the product of prime factors:");
        perfectPrimeFactorList(amount);
        System.out.println();
        System.out.println("[" + countPrimeFactor(amount) + " numbers found (" + String.format("%.2f", (countPrimeFactor(amount)*1.0*100)/100) + "%)]");
    }

    //bai3.4
    public static int gcd(int a, int b){
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void testGcd(){
        System.out.print("Enter the first number: ");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the second number: ");
        int seconNum = sc.nextInt();
        System.out.println("GCD of the two number " + firstNum + " and " + seconNum + " is: " + gcd(firstNum, seconNum));
    }
    public static void main(String[] args) {
        testPerfectAndDeficient();
        testPrime();
        testPrimeFactor();
        testGcd();
    }
}
