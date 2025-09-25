package com.micah.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String firstLine, String city) {
};

@Configuration
public class HelloWorldConfiguration {
    // you can define spring beans(objects managed by spring)

    @Bean
    public String name() {
        return "Name is Mika";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Kamono", "Pegere");
    }

    @Bean
    @Qualifier("address3")
    public Address address3() {
        return new Address("Kauzu", "Mno");
    }

    @Bean(name = "person")
    public Person person() {
        return new Person("John", 19, new Address("Maweno", "Bonyokwa"));
    }

    // spring wiring our beans (we can use method call or parameters)
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    @Qualifier("person")
    public Person person2Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    @Qualifier("person")
    public Person person3Parameters(String name, int age, @Qualifier("address3") Address address) {
        return new Person(name, age, address);
    }
}
