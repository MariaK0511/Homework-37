package org.example.application;

import org.example.entity.Operation;
import org.example.service.CalculatorService;
import org.example.service.ConsoleMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Application {
    @Autowired
    CalculatorService calculatorService;
    @Autowired
    ConsoleMessages consoleMessages;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        consoleMessages.writeMessage("Input num1: ");
        double num1 = scanner.nextDouble();
        consoleMessages.writeMessage("Input num2: ");
        double num2 = scanner.nextDouble();
        consoleMessages.writeMessage("Input type of operation: ");
        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        Operation result = calculatorService.getResult(num1, num2, operation);
        consoleMessages.writeMessage("result: " + result.getResult());
    }
}