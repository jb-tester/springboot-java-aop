package com.mytests.spring.springbootjavaaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJavaAopApplication implements CommandLineRunner {

   // @Autowired SampleRepo repo;

    private final CallServiceMethods callService;

    public SpringbootJavaAopApplication(CallServiceMethods callService) {
        this.callService = callService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJavaAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //repo.findAll();
        //repo.findByColor("red");
        callService.displayAll();
    }
}
