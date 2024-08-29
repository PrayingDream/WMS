package onem.cpx.wmsdemotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class WmsDemoTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsDemoTestApplication.class, args);
    }

}
