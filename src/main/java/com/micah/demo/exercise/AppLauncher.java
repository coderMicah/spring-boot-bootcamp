package com.micah.demo.exercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppLauncher {

    public static void main(String[] args) {

        try (var ctx = new AnnotationConfigApplicationContext(AppLauncher.class);) {

            System.out.println(ctx.getBean(BusinessCalculationService.class).getMax());
            // Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
