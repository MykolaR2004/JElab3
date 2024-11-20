package org.example.jelab3.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.example.jelab3.calculations.SumOfTerms;
import org.example.jelab3.model.Result;

@Named
@RequestScoped
@Getter
@Setter
public class SumBean {


    public SumBean() {
        x = 0.5;
        n = 5;
        e1 = 0.01;
        e2 = 0.1;
    }

    private double x;
    private int n;
    private double e1;
    private double e2;

    private Result result;

    public String calculate() {
        SumOfTerms calcFunction = new SumOfTerms();
        double sum = calcFunction.getSum(x, n);
        double firstSumOfElementsBiggerThanE = calcFunction.getFirstSumOfElementsBiggerThanE(x, n, e1);
        double secondSumOfElementsBiggerThanE = calcFunction.getFirstSumOfElementsBiggerThanE(x, n, e2);
        double difference = calcFunction.compare(x, n);

        result = new Result(sum, firstSumOfElementsBiggerThanE, secondSumOfElementsBiggerThanE, difference, null, null);
        return "sum";
    }
}

