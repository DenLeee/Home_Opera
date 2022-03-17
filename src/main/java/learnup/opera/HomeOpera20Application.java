package learnup.opera;

import learnup.opera.model.Premiere;
import learnup.opera.service.PremiereService;
import learnup.opera.service.TickedService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class HomeOpera20Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(HomeOpera20Application.class, args);

        context.getBean(PremiereService.class).getPremiereList().forEach(System.out::println);
        System.out.println();

        System.out.println(context.getBean(PremiereService.class).getPremiereByName("СПАРТАК"));
        System.out.println();

        context.getBean(PremiereService.class).addPremiere(new Premiere(5, "TEST", "rewFdsfEW", 15, 200));
        context.getBean(PremiereService.class).getPremiereList().forEach(System.out::println);
        System.out.println();

        context.getBean(PremiereService.class).updatePremireByID(5, new Premiere(5, "TEST2", "sSDFesa", 14, 250));
        context.getBean(PremiereService.class).getPremiereList().forEach(System.out::println);
        System.out.println();

        context.getBean(PremiereService.class).deletePremiereByNameOpera("TEST2");
        context.getBean(PremiereService.class).getPremiereList().forEach(System.out::println);
        System.out.println();

        context.getBean(TickedService.class).getTickedList().forEach(System.out::println);

    }

}
