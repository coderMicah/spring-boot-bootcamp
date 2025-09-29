package com.micah.demo.dependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
    // @Autowired = field based injection
    Dependency1 dependency1;
    Dependency2 dependency2;

    // Constructor based injection
    @Autowired // autowired annotation is not necessary
    public YourBusinessClass(Dependency1 dep1, Dependency2 dep2) {
        super();
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dependency1 = dep1;
        this.dependency2 = dep2;
    }

    // Setter injection
    // @Autowired
    // public void setDependecy1(Dependency1 dep1) {
    // System.out.println("Setter injection - dep1");
    // this.dependency1 = dep1;
    // }

    // @Autowired
    // public void setDependecy2(Dependency2 dep2) {
    // System.out.println("Setter injection - dep2");
    // this.dependency2 = dep2;
    // }

    public String toString() {
        return "Using" + " " + dependency1 + " and" + " " + dependency2;
    }
}

@Component
class Dependency1 {
}

@Component
class Dependency2 {
}

@Configuration
@ComponentScan
public class DILauncher {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(DILauncher.class);) {
            // Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(ctx.getBean(YourBusinessClass.class));
        }
    }

}
