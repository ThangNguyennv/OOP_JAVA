package lab2;
import java.util.*;
public class ArrayExercise {

    //bai2.1
    public static int[] createArray(Scanner in){
        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = in.nextInt();
        int items[] = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space): ");
        for(int itemsIdx = 0; itemsIdx < NUM_ITEMS; itemsIdx++){
            items[itemsIdx] = in.nextInt();
        }
        return items;
    }

    public static void printArray(int[] arr){
        System.out.print("The values are: [" + arr[0] + ", ");

        for(int arrIdx = 1; arrIdx < arr.length-1; arrIdx++){
            System.out.print(arr[arrIdx] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }

    //bai2.2
    public static int[] generateStudentGrades(Scanner in){
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        int arrayGrades[] = new int[numStudents];
        for(int arrIdx = 0; arrIdx < numStudents; arrIdx++){
            System.out.print("Enter the number of student" + (arrIdx+1) + ": ");
            arrayGrades[arrIdx] = in.nextInt();
        }
        return arrayGrades;
    }

    public static void simpleGradesStatistics(int[] arr){
        double average = 0;
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        int count = 0;
        double sum = 0;
        for(int arrIdx = 0; arrIdx < arr.length; arrIdx++){
            count++;
            sum += arr[arrIdx];
            maximum = Math.max(maximum, arr[arrIdx]);
            minimum = Math.min(minimum, arr[arrIdx]);
        }
        average = sum/count*1.0;
        System.out.println("The average is: " + String.format("%.2f", average));
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);

    }

    //bai2.3
    public static String hexadecimalToBinary(String hexStr){
        StringBuilder strBuilder = new StringBuilder();
        for(int strIdx = 0; strIdx < hexStr.length(); strIdx++){
            char hexChar = hexStr.charAt(strIdx);
            String binStr = "";

            switch (hexChar) {
                case '0':
                    binStr = "0000 ";
                    break;
                case '1':
                    binStr = "0001 ";
                    break;
                case '2':
                    binStr = "0010 ";
                    break;
                case '3':
                    binStr = "0011 ";
                    break;
                case '4':
                    binStr = "0100 ";
                    break;
                case '5':
                    binStr = "0101 ";
                    break;
                case '6':
                    binStr = "0110 ";
                    break;
                case '7':
                    binStr = "0111 ";
                    break;
                case '8':
                    binStr = "1000 ";
                    break;
                case '9':
                    binStr = "1001 ";
                case 'A':
                    case 'a':
                    binStr = "1010 ";
                    break;
                case 'B':
                case 'b':
                    binStr = "1011 ";
                    break;
                case 'C':
                case 'c':
                    binStr = "1100 ";
                    break;
                case 'D':
                case 'd':
                    binStr = "1101 ";
                    break;
                case 'E':
                case 'e':
                    binStr = "1110 ";
                    break;
                case 'F':
                case 'f':
                    binStr = "1111 ";
                    break;
                default:
                    System.out.println("Invalid hexadecimal string.");
                    break;
            }
            strBuilder.append(binStr);
        }
        return strBuilder.toString();
    }

    public static void testHexadecimalToBinary(Scanner sc) {
        System.out.print("Enter a hexadecimal string: ");
        String hexStr = sc.nextLine();

        String binaryStr = hexadecimalToBinary(hexStr);
        System.out.println("The equivalent binary string is: " + binaryStr);
    }

    //bai2.4
    public static String decimalToHexadecimal(int positiveInter){
        StringBuilder reverseStr = new StringBuilder();
        String result = "";
        while(positiveInter != 0){
            int tmp = positiveInter % 16;
            char hexDigit;
            if(tmp < 10){
                hexDigit = (char)('0' + tmp);
                result += hexDigit;

            }
            else {
                hexDigit = (char)('A' + tmp - 10);
                result += hexDigit;

            }
            positiveInter /= 16;
        }
        reverseStr.append(result);
        reverseStr.reverse();
        return reverseStr.toString();

    }

    public static void testDecimalToHexadecimal(Scanner sc){
        System.out.print("Enter a decimal number: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.print("The equivalent hexadecimal number is " + decimalToHexadecimal(number));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] items = createArray(sc);
        printArray(items); 

        int [] arr1 = generateStudentGrades(sc);
        simpleGradesStatistics(arr1);

        testHexadecimalToBinary(sc);
        testDecimalToHexadecimal(sc);


    }
}
