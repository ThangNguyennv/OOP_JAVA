package lab1;
import java.util.*;
public class Bai2_4 {
    public static void printDayInWord(int Day){
        if(Day == 0){
            System.out.println("SUNDAY");
        }
        else if(Day == 1){
            System.out.println("MONDAY");
        }
        else if(Day == 2){
            System.out.println("TUESDAY");
        }
        else if(Day == 3){
            System.out.println("WEDNESDAY");
        }
        else if(Day == 4){
            System.out.println("THURSDAY");
        }
        else if(Day == 5){
            System.out.println("FRIDAY");
        }
        else if(Day == 6){
            System.out.println("SATURDAY");
        }

        switch(Day){
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY"); 
                break; 
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("ERROR DAY");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Day = sc.nextInt();
        printDayInWord(Day);
        
    }
}
