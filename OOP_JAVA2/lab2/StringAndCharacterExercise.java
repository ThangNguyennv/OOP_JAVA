package lab2;
import java.util.*;
public class StringAndCharacterExercise {

    //bai1.1
    public static void reverseString(String inStr){
        for(int charIdx = inStr.length()-1; charIdx >= 0; charIdx--){
            System.out.print(inStr.charAt(charIdx));
        }
    }

    public static void testReverseString(Scanner sc){
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine();
        System.out.print("The reverse of the String " + "\"" + inStr + "\"" + " is " + "\"");
        reverseString(inStr);
        System.out.println("\"");

        System.out.println();
    }

    //bai1.2
    public static int countVowels(String inStr){
        int count = 0;
        for(int charIdx = 0; charIdx < inStr.length(); charIdx++){
            if(Character.isAlphabetic(inStr.charAt(charIdx)) == true){
                switch (inStr.charAt(charIdx)) {
                    case 'u':
                        count++;
                        break;
                    case 'e':
                        count++;
                        break;
                    case 'o':
                        count++;
                        break;  
                    case 'a':
                        count++;
                        break;
                    case 'i':
                        count++;
                        break;
                    default:
                        break;
                }

            }
            
        }
        return count;
    }

    public static int countDigits(String inStr){
        int count = 0;
        for(int charIdx = 0; charIdx < inStr.length(); charIdx++){
            if(Character.isDigit(inStr.charAt(charIdx)) == true){
                count++;
            }
        }
        return count;
    }

    public static void testCountVowelsDigits(Scanner sc){
        System.out.print("Enter a String: ");
        String inStr = sc.nextLine().toLowerCase();
        System.out.println("Number of vowels: " + countVowels(inStr) + " (" + String.format("%.2f", (double)countVowels(inStr)*100/inStr.length()) + "%)");
        System.out.println("Number of digits: " + countDigits(inStr) + " (" + String.format("%.2f", (double)countDigits(inStr)*100/inStr.length()) + "%)");

    }

    //bai1.3
    public static void phoneKeyPadswitchCaseDefault(String inStr){
        for(char inChar : inStr.toCharArray()){
            switch (inChar) {
                case 'a':
                case 'b':
                case 'c':
                    System.out.println("2");
                    break;
                case 'd':
                case 'e':
                case 'f':
                    System.out.println("3");
                    break;
                case 'g':
                case 'h':
                case 'i':
                    System.out.println("4");
                    break;
                case 'j':
                case 'k':
                case 'l':
                    System.out.println("5");
                    break;
                case 'm':
                case 'n':
                case 'o':
                    System.out.println("6");
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    System.out.println("7");
                    break;
                case 't':
                case 'u':
                case 'v':
                    System.out.println("8");
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    System.out.println("9");
                    break;
                default:
                    break;
            }
        }
        }
        public static void phoneKeyPadUsingNestedIf(String inStr){
            for(int charIdx = 0; charIdx <= inStr.length()-1; charIdx++){
                if(inStr.charAt(charIdx)=='a' || inStr.charAt(charIdx)=='b' || inStr.charAt(charIdx)=='c'){
                    System.out.println("2");
                }
                else if((inStr.charAt(charIdx)=='d' || inStr.charAt(charIdx)=='e' || inStr.charAt(charIdx)=='f')){
                    System.out.println("3");
                }
                else if((inStr.charAt(charIdx)=='g' || inStr.charAt(charIdx)=='h' || inStr.charAt(charIdx)=='i')){
                    System.out.println("4");
                }
                else if((inStr.charAt(charIdx)=='j' || inStr.charAt(charIdx)=='k' || inStr.charAt(charIdx)=='l')){
                    System.out.println("5");
                }
                else if((inStr.charAt(charIdx)=='m' || inStr.charAt(charIdx)=='n' || inStr.charAt(charIdx)=='o')){
                    System.out.println("6");
                }
                else if((inStr.charAt(charIdx)=='p' || inStr.charAt(charIdx)=='q' || inStr.charAt(charIdx)=='r' || inStr.charAt(charIdx)=='s')){
                    System.out.println("7");
                }
                else if((inStr.charAt(charIdx)=='t' || inStr.charAt(charIdx)=='u' || inStr.charAt(charIdx)=='v')){
                    System.out.println("8");
                }
                else {
                    System.out.println("9");
                }
            }
    }
    public static void testPhoneKeyPad(Scanner sc){
        String inStr = sc.nextLine().toLowerCase();
        phoneKeyPadswitchCaseDefault(inStr);
        phoneKeyPadUsingNestedIf(inStr);
    }

    //bai1.4
    public static void cipherCaesarCode(String inStr){
        String result = "";
        for(char inChar : inStr.toCharArray()){
            if(inChar >= 65 && inChar <= 90){
                result += (char)((inChar - 65 + 3) % 26 + 65);
            }
        }
        System.out.println(result);
    }

    public static void testCipherCaesarCode(Scanner sc){
        System.out.print("Enter a plaintext String: ");
        String inStr = sc.nextLine().toUpperCase();
        System.out.print("The ciphertext string is: ");
        cipherCaesarCode(inStr);
        System.out.println();
    }

    //bai1.5
    public static void decipherCaesarCode(String inStr){
        String result = "";
        for(char inChar : inStr.toCharArray()){
            if(inChar >= 65 && inChar <= 90){
                result += (char)((inChar - 65 - 3) % 26 + 65);
            }
        }
        System.out.println(result);
    }

    public static void testDecipherCaesarCode(Scanner sc){
        System.out.print("Enter a ciphertext String: ");
        String inStr = sc.nextLine().toUpperCase();
        System.out.print("The plaintext string is: ");
        decipherCaesarCode(inStr);
        System.out.println();
    }

    //bai1.6
    public static boolean isHexString(String hexStr){
        for(char inChar : hexStr.toCharArray()){
            if(!( (inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f')) ){
                return false;
            }
        }
        return true;
    }

    public static void testHexString(Scanner sc){
        System.out.print("Enter is hex string: ");
        String inStr = sc.nextLine();
        System.out.println();
        if(isHexString(inStr) == true){
            System.out.println("\"" + inStr + "\"" + " is a hex string");
        }
        else{
            System.out.println("\"" + inStr + "\"" + " is NOT a hex string");
        }
    }

    //bai1.7

        //code ngay tho
        public static int binaryToDecimal(String bin_Str){
            int number = Integer.parseInt(bin_Str);
            int base = 1;
            int bin = 0;
            while(number > 0){
                bin += (number%10)*base;
                base *= 2;
                number /=10;
            }
            return bin;
        }

        //code toi uu
        public static int binaryToDecimal_Toiuu(String bin_Str){
            int decimalNum = bin_Str.charAt(0) - '0';
            for(int i = 1; i < bin_Str.length(); i++){
                decimalNum = decimalNum*2 + bin_Str.charAt(i) - '0';
            }
            return decimalNum;
        }

        public static void testBinaryDecimal(Scanner sc){
            System.out.print("Enter a Binary string: ");
            String str = sc.nextLine();
            boolean check = true;
            for(char inChar : str.toCharArray()){
                if(inChar != '0' && inChar != '1'){
                    check = false;
                    break;
                }
                check = true;
            }
            if(check == true)
                System.out.println("The equivalent decimal number for binary " + "\"" + str + "\"" + " is: " + binaryToDecimal_Toiuu(str));
            else
                System.out.println("error: invalid binary string " + "\"" + str + "\"");
        }

        //bai1.8
        public static boolean checkHexCharToDecimal(String hexStr){
        for(char hexChar : hexStr.toCharArray()){
            if(!((hexChar >= '0' && hexChar <= '9') || (hexChar >= 'A' && hexChar <= 'F') || (hexChar >= 'a' && hexChar <= 'f')))
               return false;
        }
        return true;
            
            
        }

        //code ngay tho
        public static void hexadecimalToDecimal(String  hexStr){
            int base = 1;
            int hexdetoDecimal = 0;
            for(int i = hexStr.length() - 1; i >= 0; i--){
                if(hexStr.charAt(i) >= '0' && hexStr.charAt(i) <= '9')
                    hexdetoDecimal += (hexStr.charAt(i) - '0')*base;
                else if(hexStr.charAt(i) >= 'A' && hexStr.charAt(i) <= 'F')
                    hexdetoDecimal += (hexStr.charAt(i) - 'A' + 10)*base;
                else if(hexStr.charAt(i) >= 'a' && hexStr.charAt(i) <= 'f')
                    hexdetoDecimal += (hexStr.charAt(i) - 'a' + 10)*base;
                base *= 16;
            }
            System.out.println(hexdetoDecimal);
        }

        //code toi uu
        public static void hexadecimalToDecimal_toiuu(String  hexStr){
            int hexdetoDecimal = 0;
            for(int i = 0; i < hexStr.length(); i++){
                if(Character.isDigit(hexStr.charAt(i)))
                    hexdetoDecimal = hexdetoDecimal*16 + (hexStr.charAt(i) - '0');
                else
                    hexdetoDecimal = hexdetoDecimal*16 + (hexStr.charAt(i) - 'A' + 10);
            }
            System.out.println(hexdetoDecimal);
        }
        
        public static void testHexadecimalToDecimal(Scanner sc){
            System.out.print("Enter a Hexadecimal string: ");
            String str = sc.nextLine();
            String newStr = str.toUpperCase();
            if(checkHexCharToDecimal(newStr) == true){
                System.out.print("The equivalent decimal number for hexadecimal " + "\"" + str + "\"" + " is: ");
                hexadecimalToDecimal_toiuu(newStr);
            }
            else{
                System.out.println("error: invalid hexadecimal string " + "\"" + str + "\"");
            }
            

        }

        //bai1.9

        //code ngay tho
        public static int octalToDecimal(String oct_Str){
            int number = Integer.parseInt(oct_Str);
            int base = 1;
            int oct = 0;
            while(number > 0){
                oct += (number%10)*base;
                base *= 8;
                number /=10;
            }
            return oct;
        }

        //code toi uu
        public static int octalToDecimal_toiuu(String bin_Str){
            int octalNum = bin_Str.charAt(0) - '0';
            for(int i = 1; i < bin_Str.length(); i++){
                octalNum = octalNum*8 + bin_Str.charAt(i) - '0';
            }
            return octalNum;
        }

        public static void testOctalToDecimal(Scanner sc){
            System.out.print("Enter a Octal string: ");
            String str = sc.nextLine();
            System.out.println("The equivalent decimal number for Octal " + "\"" + str + "\"" + " is: " + octalToDecimal_toiuu(str));
        }

        //bai1.10


        public static int radixNToDecimal(String radixNStr, int radix) {
            int base = 1;
            int hexdetoDecimal = 0;
            for(int i = radixNStr.length() - 1; i >= 0; i--){
                if(radixNStr.charAt(i) >= '0' && radixNStr.charAt(i) <= '9'){
                    hexdetoDecimal += (radixNStr.charAt(i) - '0')*base;
                    base *= radix;
                }
                else if(radixNStr.charAt(i) >= 'A' && radixNStr.charAt(i) <= 'F'){
                    hexdetoDecimal += (radixNStr.charAt(i) - 'A' + 10)*base;
                    base *= radix;
                }
                else if(radixNStr.charAt(i) >= 'a' && radixNStr.charAt(i) <= 'f'){
                    hexdetoDecimal += (radixNStr.charAt(i) - 'a' + 10)*base;
                    base *= radix;
                }
            }
            return hexdetoDecimal;
        }
        
        public static void testRadixNToDecimal(Scanner sc) {    
            System.out.print("Enter the radix: ");
            int radix = Integer.parseInt(sc.nextLine());
            System.out.print("Enter the String: ");
            String Str = sc.nextLine();
            int decimalNumber = radixNToDecimal(Str, radix);
            System.out.println("The equivalent decimal number: " + "\"" + Str + "\"" + " is: " + decimalNumber);
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // testReverseString(sc);
        // testCountVowelsDigits(sc);
        // testPhoneKeyPad(sc);
        // testCipherCaesarCode(sc);
        // testDecipherCaesarCode(sc);
        // testHexString(sc);
        // testBinaryDecimal(sc);
        testHexadecimalToDecimal(sc);
        // testOctalToDecimal(sc);
        // testRadixNToDecimal(sc);
    }
}
