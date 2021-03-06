package eu.epitech;

import java.util.Arrays;

import de.tobj.twitch.streamobserver.TwitchStreamObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            //String[] beanNames = ctx.getBeanDefinitionNames();
            //Arrays.sort(beanNames);
            //for (String beanName : beanNames) {
            //    System.out.println(beanName);
            //}


            //TwitchObserver obs = new TwitchObserver("akjhceuw45sfdlva4r7afva4266gbe");
            //obs.addChannel("ogaminglol");
            //obs.exec();

            FacebookObserver fbObs = new FacebookObserver();
            fbObs.exec();
        };
    }

}