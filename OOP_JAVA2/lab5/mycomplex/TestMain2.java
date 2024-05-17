package lab5.mycomplex;

public class TestMain2 {
    public static void main(String[] args) {

        // Test constructor and toString()
        System.out.println("Enter complex number 1 (real and imaginary part): 1 1" );
        System.out.println("Enter complex number 2 (real and imaginary part): 2 1" );
        MyComplexApp mycomplexapp1 = new MyComplexApp(1, 1);
        MyComplexApp mycomplexapp2 = new MyComplexApp(2, 1);

        // Test isReal() and isImaginary()
        System.out.println("Number 1 is: " + mycomplexapp1);
        if(mycomplexapp1.isReal() == false){
            System.out.println(mycomplexapp1 + " is NOT a pure real number");
        } else{
            System.out.println(mycomplexapp1 + " is a pure real number");
        }
        if(mycomplexapp1.isImaginary() == false){
            System.out.println(mycomplexapp1 + " is NOT a pure imaginary number");
        } else{
            System.out.println(mycomplexapp1 + " is a pure imaginary number");
        }
        
        System.out.println("Number 2 is: " + mycomplexapp2);
        if(mycomplexapp2.isReal() == false){
            System.out.println(mycomplexapp2 + " is NOT a pure real number");
        } else{
            System.out.println(mycomplexapp2 + " is a pure real number");
        }
        if(mycomplexapp2.isImaginary() == false){
            System.out.println(mycomplexapp2 + " is NOT a pure imaginary number");
        } else{
            System.out.println(mycomplexapp2 + " is a pure imaginary number");
        }
            
        // Test equals()
        if(mycomplexapp1.equals(mycomplexapp2) == false){
            System.out.println(mycomplexapp1 + " is NOT equal to " + mycomplexapp2);
        } else{
            System.out.println(mycomplexapp1 + " is equal to " + mycomplexapp2);
        }

        // Test add()
        System.out.println(mycomplexapp1 + " + " + mycomplexapp2 + " = " + mycomplexapp1.add(mycomplexapp2));

        // Test subtract()
        System.out.println(mycomplexapp1 + " - " + mycomplexapp2 + " = " + mycomplexapp1.subtract(mycomplexapp2));

        // Test multiply()
        System.out.println(mycomplexapp1 + " * " + mycomplexapp2 + " = " + mycomplexapp1.multiply(mycomplexapp2));

        // Test divide()
        System.out.println(mycomplexapp1 + " / " + mycomplexapp2 + " = " +mycomplexapp1.divide(mycomplexapp2));

        // Test conjugate() (Khi test ta sử dụng hàm toString() mà mình comment lại để ra kết quả mong muốn)
        System.out.println("conjugare of " + mycomplexapp1 + " is: "  + mycomplexapp1.conjugate());
    }
}
