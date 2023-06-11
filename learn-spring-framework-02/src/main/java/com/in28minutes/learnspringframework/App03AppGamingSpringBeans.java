package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class GamingAppLauncherApplication {
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class);
        context.getBean(GamingConsole.class).up();
        context.getBean(GameRunner.class).run();
    }
}
