package com.in28minutes.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}
@Component
@Lazy
class ClassB {
    private ClassA classA;
    public ClassB(ClassA classA) {
        //Logic
        System.out.println("Some Initialization logic");
        this.classA = classA;
    }
}
@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class);
    }
}
