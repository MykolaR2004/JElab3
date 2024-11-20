package org.example.jelab3.calculations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SumOfTerms {

    public double getFirstSumOfElementsBiggerThanE(double x, double terms, double e1) {
        return xResrtictions(x, terms, e1);
    }

    private double xResrtictions(double x, double terms, double e1) {
        if (x <= -1 || x >= 1) {
            throw new IllegalArgumentException("x должен быть в диапазоне (-1, 1)");
        }

        double result = 0.0;

        for (int n = 1; n <= terms; n += 2) {
            double term = Math.pow(x, n) / n;
            if (Math.abs(term) > e1) {
                result += term;
            }
        }
        return 2 * result;
    }

    public double getSecondSumOfElementsBiggerThanE(double x, double terms, double e2) {
        return xResrtictions(x, terms, e2);
    }


    public double getSum(double x, double terms) {
        if (x <= -1 || x >= 1) {
            throw new IllegalArgumentException("x должен быть в диапазоне (-1, 1)");
        }
        double result = 0.0;
        for (int n = 1; n <= terms; n += 2) {
            result += (Math.pow(x, n) / n);
        }
        return 2 * result;
    }

    public double exactLogValue(double x) {
        return Math.log((1 + x) / (1 - x));
    }


    public double compare(double x, double terms){
        double approxValue = getSum(x, terms);
        double exactValue = exactLogValue(x);
        return Math.abs(exactValue - approxValue);
    }
}
