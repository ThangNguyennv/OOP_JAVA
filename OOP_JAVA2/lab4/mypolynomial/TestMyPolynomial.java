package lab4.mypolynomial;

public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(0, -2, 3);
        MyPolynomial polynomial2 = new MyPolynomial(0, -2, 0, 4, -2, 0);

        System.out.println("Polynomial 1: " + polynomial1);
        System.out.println("Polynomial 2: " + polynomial2);

        System.out.println("Degree of Polynomial 1: " + polynomial1.getDegree());
        System.out.println("Degree of Polynomial 2: " + polynomial2.getDegree());

        double x = 2.0;
        System.out.println("Evaluation of Polynomial 1 at x = " + x + ": " + polynomial1.evaluate(x));
        System.out.println("Evaluation of Polynomial 2 at x = " + x + ": " + polynomial2.evaluate(x));

        System.out.println("Result of addition: " + polynomial1.add(polynomial2));
        System.out.println("Result of multiplication: " + polynomial1.multiply(polynomial2));
    }
}
