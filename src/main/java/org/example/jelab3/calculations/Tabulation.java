package org.example.jelab3.calculations;

public class Tabulation {
    double[] xValues;
    double[] yValues;

    public void calculate(double start, double end, double step) {

        int n = (int) countStep(start, end, step);
        xValues = new double[n];
        yValues = new double[n];

        for (int i = 0; i < n; i++) {
            xValues[i] = start + i * step ;
            yValues[i] = function(xValues[i]);
        }
    }

    private double function(double x){
        return Math.tan(x)/(Math.log(x)-1);
    }

    public double countStep(double start, double end, double step) {
        if (start==end) return 0;
        return (int) ((end - start) / step + 1);
    }

    public double[] getXArr() {
        return xValues;
    }

    public double[] getYArr() {
        return yValues;
    }
}
