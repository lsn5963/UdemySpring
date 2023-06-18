package com.in28minutes.learnspringframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //프로토타입 클래스
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class);
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        // 해시코드가 똑같이 나옴

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        // 다른 해시코드가 나옴 (Bean 인스턴스가 새로 생성된다.)



        //싱글톤 -> Spring IOC 컨테이너당 객체 인스터스가 딱 한개가 나온다.

        //싱글톤이 default
        // 스프링 싱글톤 vs 자바 싱글톤
        // 스프링 싱글톤의 경우 Spring ioC 컨테이너당 객체 인스턴스가 하나라고 이야기한다.
        // Java 싱글톤에서는 Java 가상 머신 하나당 객체 인스턴스가 하나다. Java 가상 머신 전체에서 객체가 하나이다.
        // 자바 싱글톤에서 스프링 컨테이너를 여러개를 실행하지 않는다 -> Spring 싱클톤 = Java 싱글톤이다.
    }
}
