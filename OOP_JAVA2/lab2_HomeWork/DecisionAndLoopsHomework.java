package lab2_HomeWork;
import java.util.*;
public class DecisionAndLoopsHomework {

    static Scanner sc = new Scanner(System.in);

    //bai1.1
    public static void guessNumber(int number, Scanner in){
        boolean isValid = false;
        int count = 0;
        System.out.println("Key in your guess:");
        int keyNumber = sc.nextInt();
        count = 1;
        do{
            if(keyNumber == number){
                System.out.println("You got it in " + count + " trials!");
                isValid = true;
                break;
            }
            else {
                if(keyNumber > number){
                    System.out.println("Try lower");
                    keyNumber = sc.nextInt();
                    count++;
                }
                else{
                    System.out.println("Try higher");
                    keyNumber = sc.nextInt();
                    count++;
                }
            }
        }
        while(!isValid);
            in.close();
    }
    public static void guessNumber(){
        final int SECRETNUMBER = (int)(Math.random()*100);
        guessNumber(SECRETNUMBER, sc);

    }

    //bai1.2
    public static void guessWord(){
        System.out.print("Enter the word to guess: ");
        final String wordToGuess = sc.next().toLowerCase();
        guessWord(wordToGuess,sc);
    }
    public static void guessWord(String guessedString, Scanner in){
        int worldLength = guessedString.length();
        boolean[] guessedWord = new boolean[worldLength];
        String guess;
        int count = 0;
        while (true) {
            System.out.print("Key in one character your guess word: ");
            guess = in.next().toLowerCase();
            count++;
            if (guess.length() == 1) {
                System.out.print("Trial " + count + ": ");
                for (int i = 0; i < worldLength; i++) {
                    if (String.valueOf(guessedString.charAt(i)).equals(guess)) {
                        guessedWord[i]= true;
                    }
                }
                for (int i = 0; i < worldLength; i++) {
                    if (guessedWord[i] == true) {
                        System.out.print(guessedString.charAt(i));
                    } else {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
            if (guess.equals(guessedString)) {
                System.out.println("Congratulation!");
                System.out.println("You got in " + count + " trials");
                break;
            }
        }
    }

    public static void main(String[] args) {
        guessNumber();
        guessWord();
    }
}
