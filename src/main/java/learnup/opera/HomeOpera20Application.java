package learnup.opera;

import learnup.opera.service.TickedService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HomeOpera20Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(HomeOpera20Application.class, args);
    }

}
