package lab1;
import java.util.*;
public class Bai2_1 {
    public static void checkPassFail(int mark){
        System.out.println("The mark is " + mark);
        if(mark >= 50){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
        System.out.println("DONE");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        checkPassFail(mark);
            

    }
}
