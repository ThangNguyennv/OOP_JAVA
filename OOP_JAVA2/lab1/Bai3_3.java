package lab1;
public class Bai3_3 {
    public static void computePI1(){
        double sum = 0.0;
        int MAXDENOMINATOR = 1000;
        for(int denominator = 1; denominator <= MAXDENOMINATOR; denominator+=2){
            if(denominator % 4 == 1){
                sum += 4*(1.0 / denominator);
            }
            else if(denominator % 4 == 3){
                sum -= 4*(1.0 / denominator);
            }
            else {
                System.out.println("Impossible!!!");
            }
        }
        System.out.println(sum);
    }

    public static void computePI2(){
        int MAXTERM = 10000;
        double sum = 0.0;
        for(int term = 1; term <= MAXTERM; term++){
            if(term % 2 == 1){
                sum += 1.0 / (term *2 - 1);
            }
            else{
                sum -= 1.0 / (term*2 - 1);
            }
        }
        System.out.println(4*sum);
    }

    public static void main(String[] args) {
        computePI1();
        computePI2();
    }
}