package com.mytests.spring.springbootjavaaop;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 5/24/2023.</p>
 * <p>Project: springboot-java-aop</p>
 * *
 */
public interface SampleRepo extends CrudRepository<Sample,Integer> {
    List<Sample> findByColor(String color);
}
