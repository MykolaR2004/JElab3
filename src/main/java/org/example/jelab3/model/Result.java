package org.example.jelab3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.jelab3.beans.Point;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class Result {


    private double sum;
    private double sumOfElementsBiggerThanE;
    private double difference;
    private double[] xArr;
    private double[] yArr;

    public Result(double sum, double[] yArr, double[] xArr, double difference, double sumOfElementsBiggerThanE) {
        System.out.println("Here's result constructor invoked");
        this.sum = sum;
        this.xArr = xArr;
        this.yArr = yArr;
        this.difference = difference;
        this.sumOfElementsBiggerThanE = sumOfElementsBiggerThanE;
    }

    public List<Point> getPairs() {
        List<Point> pairs = new ArrayList<>();
        for (int i = 0; i < xArr.length; i++) {
            pairs.add(new Point(xArr[i], yArr[i]));
        }
        return pairs;
    }

}
