package example.springdata.rest.projections;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    @Autowired
    MotoRepository motoRepository;

    public static void main(String... args) {
        ConfigurableApplicationContext cac = SpringApplication.run(Application.class, args);
        cac.toString();
        System.out.println();
    }

    public @PostConstruct void init() {
        motoRepository.save(new Moto("CB300R", 2012, new Montadora("Honda")));
        motoRepository.save(new Moto("XJ6-N", 2015, new Montadora("Yamaha")));
    }
}
