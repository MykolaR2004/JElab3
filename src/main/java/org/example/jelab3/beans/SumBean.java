package org.example.jelab3.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;
import org.example.jelab3.calculations.SumOfTerms;
import org.example.jelab3.model.Result;

import java.util.logging.Logger;

@Named
@RequestScoped
@Getter
@Setter
public class SumBean {


    public SumBean() {
        x = 0.5;
        n = 5;
        e = 0.01;
    }

    private double x;
    private int n;
    private double e;

    private Result result;

    public String calculate() {
        SumOfTerms calcFunction = new SumOfTerms();
        double sum = calcFunction.getSum(x, n);
        double sumOfElementsBiggerThanE = calcFunction.getSumOfElementsBiggerThanE(x, n, e);
        double difference = calcFunction.compare(x, n);

        result = new Result(sum, sumOfElementsBiggerThanE, difference, null, null);
        return "sum";
    }
}

