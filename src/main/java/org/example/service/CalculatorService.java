package org.example.service;

import org.example.entity.Operation;
import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

    private double sum(double num1, double num2) {
        return num1 + num2;
    }

    private double sub(double num1, double num2) {
        return num1 - num2;
    }

    private double mul(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        return num1 / num2;
    }

    public Operation getResult(double num1, double num2, String operation) {
        Operation calculate = new Operation(num1, num2, operation, 0);
        switch (operation) {
            case ("sum"):
                calculate.setResult(sum(num1, num2));
                return calculate;
            case ("sub"):
                calculate.setResult(sub(num1, num2));
                return calculate;
            case ("mul"):
                calculate.setResult(mul(num1, num2));
                return calculate;
            case ("div"):
                calculate.setResult(div(num1, num2));
                return calculate;
            default:
                return null;
        }
    }
}