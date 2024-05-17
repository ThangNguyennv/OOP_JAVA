package lab5.mycomplex;

public class TestMain1 {
    public static void main(String[] args) {

        // Test constructor and toString()
        System.out.println("Enter complex number 1 (real and imaginary part): 1.1 2.2" );
        System.out.println("Enter complex number 2 (real and imaginary part): 3.3 4.4" );
        MyComplex mycomplex1 = new MyComplex(1.1, 2.2);
        MyComplex mycomplex2 = new MyComplex(3.3, 4.4);

        // Test isReal() and isImaginary()
        System.out.println("Number 1 is: " + mycomplex1);
        if(mycomplex1.isReal() == false){
            System.out.println(mycomplex1 + " is NOT a pure real number");
        } else{
            System.out.println(mycomplex1 + " is a pure real number");
        }
        if(mycomplex1.isImaginary() == false){
            System.out.println(mycomplex1 + " is NOT a pure imaginary number");
        } else{
            System.out.println(mycomplex1 + " is a pure imaginary number");
        }
        
        System.out.println("Number 2 is: " + mycomplex2);
        if(mycomplex2.isReal() == false){
            System.out.println(mycomplex2 + " is NOT a pure real number");
        } else{
            System.out.println(mycomplex2 + " is a pure real number");
        }
        if(mycomplex2.isImaginary() == false){
            System.out.println(mycomplex2 + " is NOT a pure imaginary number");
        } else{
            System.out.println(mycomplex2 + " is a pure imaginary number");
        }

        // Test equals()
        if(mycomplex1.equals(mycomplex2) == false){
            System.out.println(mycomplex1 + " is NOT equal to " + mycomplex2);
        } else{
            System.out.println(mycomplex1 + " is equal to " + mycomplex2);
        }
            
        // Test addInto()
        System.out.println(mycomplex1 + " + " + mycomplex2 + " = " + mycomplex1.addInto(mycomplex2));
    }
}
