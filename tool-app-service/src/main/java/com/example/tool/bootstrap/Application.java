package com.example.tool.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.tool"})
@Slf4j
public class Application{
    public static void main(String[] args) {
        log.info("#############################################################################");
        log.info("###################### Tool-APP-Service Started! ######################");
        log.info("#############################################################################");
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);

    }
}
