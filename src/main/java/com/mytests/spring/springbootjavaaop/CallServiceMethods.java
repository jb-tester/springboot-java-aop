package com.mytests.spring.springbootjavaaop;

import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 5/24/2023.</p>
 * <p>Project: springboot-java-aop</p>
 * *
 */
@Service
public class CallServiceMethods {

    private final SampleService sampleService;

    public CallServiceMethods(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    public void displayAll() {
        sampleService.displayAllSamples();
        sampleService.displayByColor("red");
    }
}
