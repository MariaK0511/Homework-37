package org.example.service;

import org.springframework.stereotype.Component;

@Component
public class ConsoleMessages {

    public void writeMessage(String message) {
        System.out.println(message);
    }
}