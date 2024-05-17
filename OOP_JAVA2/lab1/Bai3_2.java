package lab1;
import java.util.*;
public class Bai3_2 {
    public static void HarmonicSum(){
        final int MAXDENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for(int denominator = 1; denominator <= MAXDENOMINATOR; denominator++){
            sumL2R += 1.0 / denominator;
        }
        for(int denominator = MAXDENOMINATOR-1; denominator >= 1; denominator--){
            sumR2L += 1.0 / denominator;
        }
        System.out.println("The sum from left to right is : " + sumL2R);
        System.out.println("The sum from right to left is : " + sumR2L);

        System.out.println(absDiff = (sumL2R > sumR2L) ? Math.abs(sumL2R-sumR2L) : Math.abs(sumR2L-sumL2R));
    }

    public static void main(String[] args) {
        HarmonicSum();
    }
    
}
