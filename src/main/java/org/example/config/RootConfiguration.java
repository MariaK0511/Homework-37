package org.example.config;


import org.example.application.Application;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.Scanner;

@Configuration
@ComponentScan("org.example")
@EnableAspectJAutoProxy
public class RootConfiguration {
    @Bean
    public Application application() {
        return new Application();
    }
}