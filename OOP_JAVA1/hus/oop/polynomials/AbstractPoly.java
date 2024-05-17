package hus.oop.polynomials;

import java.util.Arrays;

public abstract class AbstractPoly implements Poly {
    
    public AbstractPoly() {

    }

    // Returns an array of coefficients in a polynomial
    double[] derive() {
        double[] coefficients = coefficients(); // Method to get the polynomial coefficients
        int degree = coefficients.length - 1; // Method to get the polynomial degree

        // Perform the derivative calculation
        if (degree == 0) {
            return new double[]{0};
        }
        double[] derivativeCoefficients = new double[degree]; 
        for (int i = degree; i >= 1; i--) {
            derivativeCoefficients[degree - i] = coefficients[degree - i] * (i);
        }
        return derivativeCoefficients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractPoly)) {
            return false;
        }
        return Arrays.equals(this.coefficients(), ((Poly) o).coefficients());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        int degree = degree();
        boolean firstNotZero = false;

        for (int i = degree; i >= 0; i--) {
            double coeff = coefficients()[degree - i];
            if (coeff != 0) {
                if (coeff > 0 && firstNotZero) {
                    builder.append(" + ");
                } else if (coeff < 0) {
                    builder.append(" - ");
                }
                coeff = Math.abs(coeff);
                if (i == 0 || coeff != 1) {
                    builder.append(coeff);
                }
                if (i >= 1) {
                    builder.append("x");

                    if (i > 1) {
                        builder.append("^").append(i);
                    }
                }
                firstNotZero = true;
            }
        }
        return builder.toString();
    }
}