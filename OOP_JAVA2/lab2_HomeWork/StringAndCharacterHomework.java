package lab2_HomeWork;
import java.util.*;
public class StringAndCharacterHomework {

    static Scanner sc = new Scanner(System.in);

    //bai3.1
    public static String exchangeCipher(String inStr){
        String result = "";
        for(char inChar : inStr.toCharArray()){
            int key = inChar - 'A';
            inChar = (char)('Z' - key);
            result += inChar;
        }
        return result;
    }

    public static void testExchangeCipher(){
        System.out.print("Enter a plaintext String: ");
        String inStr = sc.nextLine().toUpperCase();
        System.out.print("The ciphertext string is: ");
        System.out.println(exchangeCipher(inStr));
        System.out.println();
    }

    //bai3.2
    public static boolean isPalindromicWord(String Str){
        int fIdx = 0;
        int bIdx = Str.length()-1;
        while (fIdx<bIdx){
            if(Str.charAt(fIdx)!=Str.charAt(bIdx)){
                return false;
            }
            ++fIdx;
            --bIdx;
        }
        return true;
    }
    public static void testPalindromicWord(){
        System.out.print("Enter a palindromicword string: ");
        String Str = sc.nextLine();
        String str = Str.toUpperCase();
        if(isPalindromicWord(str)){
            System.out.println(Str + " is a Palindromic word");
        } else {
            System.out.println(Str + " is a not Palindromic word");
        }
    }

    public static boolean isPalindromicPhrase(String Str){
        String result = "";
        for(char inChar : Str.toCharArray()){
            if((inChar>=65&&inChar<=90)||(inChar>=97&&inChar<=122)){
                result+=inChar;
            }
        }
        result = result.toUpperCase();
        return isPalindromicWord(result);
    }
    public static void testPalindromicPharse(){
        System.out.print("Enter a palindromicpharse string: ");
        String Str = sc.nextLine();
        if(isPalindromicPhrase(Str)){
            System.out.println(Str + " is a Palindromicpharse word");
        } else {
            System.out.println(Str + " is a not Palindromicparse word");
        }
    }
    public static void main(String[] args) {
        testExchangeCipher();
        testPalindromicPharse();
        testPalindromicWord();
    }
}
