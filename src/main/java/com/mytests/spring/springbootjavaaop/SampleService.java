package com.mytests.spring.springbootjavaaop;

import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 5/24/2023.</p>
 * <p>Project: springboot-java-aop</p>
 * *
 */

@Service
public class SampleService {

    private final SampleRepo repo;

    public SampleService(SampleRepo repo) {
        this.repo = repo;
    }

    public void displayAllSamples(){
        System.out.println("findAll() method");
        //System.out.println("all samples:");
        for (Sample sample : repo.findAll()) {
            //System.out.println(sample);
        }
    }
    @MyMethodAnno
    public void displayByColor(String color){
        System.out.println("findByColor('red') method");
        //System.out.println("all samples with " + color + " color:");
        for (Sample sample : repo.findByColor(color)) {
            //System.out.println(sample);
        }
    }


}
