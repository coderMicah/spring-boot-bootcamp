package com.micah.demo;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.micah.demo.helloworld.HelloWorldConfiguration;

public class App01SpringBasic {
    public static void main(String[] args) {
        // 1: Launch Spring context (appliaction context )
        try (var ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);) {
            // 2: Configure things we want spring to manage (in the application context)
            // HelloWorldConfiguration -@Configuration
            // name ->@Bean

            // 3:Retrieving beans managed by spring
            // System.out.println(ctx.getBean("name"));
            // System.out.println(ctx.getBean("age"));
            // System.out.println(ctx.getBean("person"));
            // System.out.println(ctx.getBean("person2MethodCall"));
            System.out.println(ctx.getBean("person2Parameters"));
            System.out.println(ctx.getBean("person3Parameters"));

            // getting all bean definition names
            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}
