package sun.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest02Application.class, args);
        System.out.println("SpringBoot starts by JDK11");
    }

}
