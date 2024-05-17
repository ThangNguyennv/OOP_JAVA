package hus.oop.polynomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly extends AbstractPoly {
    List<Double> coefficients;

    public ListPoly(double[] coeffs) {
        this.coefficients = new ArrayList<>();
        for (double coefficient : coeffs) {
            this.coefficients.add(coefficient);
        }
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    // Derivative calculation
    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }

    // Returns the coefficient in index
    @Override
    public double coefficient(int degree) {
        if (degree >= 0 && degree < coefficients.size()) {
            return coefficients.get(degree);
        } else {
            return 0.0;
        }
    }

    // Returns the coefficient in an array
    @Override
    public double[] coefficients() {
        double[] coeffs = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }
}