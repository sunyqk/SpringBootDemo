package sun.com.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTest01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTest01Application.class, args);
        System.out.println("SpringBoot starts by JDK8");
    }

}
