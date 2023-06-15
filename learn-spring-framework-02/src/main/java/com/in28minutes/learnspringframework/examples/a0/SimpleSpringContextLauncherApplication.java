package com.in28minutes.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.in28minutes.learnspringframework.examples.a1")
public class SimpleSpringContextLauncherApplication {
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class);
    }
}
