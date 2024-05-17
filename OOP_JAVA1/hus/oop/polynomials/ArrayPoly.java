package hus.oop.polynomials;

import java.util.Arrays;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    // Derivative calculation
    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }

    // Returns the coefficient in index
    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.length) {
            return coefficients[degree];
        } else {
            return 0.0;
        }
    }

    // Returns the coefficient in an array
    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficients, coefficients.length);
    }
}