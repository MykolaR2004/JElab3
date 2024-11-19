package org.example.jelab3.calculations;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SumOfTerms {

    public double getSumOfElementsBiggerThanE(double x, double terms, double e) {
        if (x <= -1 || x >= 1) {
            throw new IllegalArgumentException("x должен быть в диапазоне (-1, 1)");
        }

        double result = 0.0;

        for (int n = 1; n <= terms; n += 2) {
            double term = Math.pow(x, n) / n;
            if (Math.abs(term) > e) {
                result += term;
            }
        }
        return 2 * result;
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

    public double logSeries(double x, double terms) {
        double result = 0.0;
        for (int n = 1; n <= terms; n += 2) {
            result += (Math.pow(x, n) / n);
        }
        return 2 * result;
    }

    public double exactLogValue(double x) {
        return 2 * Math.log((1 + x) / (1 - x));
    }


    public double compare(double x, double terms){
        double approxValue = logSeries(x, terms);
        double exactValue = exactLogValue(x);
        return Math.abs(exactValue - approxValue);
    }
}
