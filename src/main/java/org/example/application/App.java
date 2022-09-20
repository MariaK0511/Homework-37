package org.example.application;

import org.example.config.RootConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Application application = applicationContext.getBean("application", Application.class);
        application.run();
    }
}
