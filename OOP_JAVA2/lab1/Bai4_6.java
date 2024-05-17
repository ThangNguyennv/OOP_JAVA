package lab1;
import java.util.*;
public class Bai4_6 {
    public static void inputValidation(Scanner sc){
        boolean isValid = false;
        do{
            System.out.print("Enter an integer between 0-10 or 90-100: ");
            int number = sc.nextInt();
            if( (number >= 0 && number <= 10) || (number >= 90 && number <= 100) ){
                isValid = true;
                System.out.print("You have entered: " + number);
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        } while(!isValid);
        sc.close();
            

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inputValidation(sc);
    }
}
