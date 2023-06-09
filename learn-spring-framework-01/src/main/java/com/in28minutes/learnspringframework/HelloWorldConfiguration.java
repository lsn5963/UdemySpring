package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){
}
record Address (String firstLine, String city){

}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Ranga";
    }
    @Bean
    public int age() {
        return 15;
    }
    @Bean
    public Person person() {
        var person = new Person("Ravi", 20);
        return person;
    }
    @Bean
    public Address address() {
        return new Address("sdas","zdxczc");
    }

}
