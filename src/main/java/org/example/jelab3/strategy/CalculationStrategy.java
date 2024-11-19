package org.example.jelab3.strategy;

import jakarta.servlet.http.HttpServletRequest;
import org.example.jelab3.model.Result;

public interface CalculationStrategy {
    Result calculate(HttpServletRequest request);
}

