package lab1;
import java.util.*;
public class Bai4_7 {
    public static void averageWithInputValidation(Scanner sc){
        final int NUMSTUDENTS = 3;
        int number;
        int sum = 0;
        double average;
        boolean isValid;
        for(int studentNo = 1; studentNo <= NUMSTUDENTS; studentNo++){
            isValid = false;
        do{
            number = sc.nextInt();
            if( number >= 0 && number <= 100 ){
                isValid = true;
                System.out.println("Enter the mark (0-100) for student " + studentNo + ": " + number);
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while(!isValid);
            sum += number;
        }
        average = sum*1.0 / NUMSTUDENTS;
        System.out.println("The average is: " + String.format("%.2f", average));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        averageWithInputValidation(sc);
    }
}
