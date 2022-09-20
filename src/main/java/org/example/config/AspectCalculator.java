package org.example.config;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class AspectCalculator {
    private final static Logger log = Logger.getLogger("CalculatorLogger");

    @Pointcut("execution(public * org.example.service.CalculatorService.getResult(..))")

    public void loggingPointcut() {
    }

    @Before("loggingPointcut()")
    public void logging() {
        log.info("Method Start!");
    }
}