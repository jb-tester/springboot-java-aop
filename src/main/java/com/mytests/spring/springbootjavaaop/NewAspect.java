package com.mytests.spring.springbootjavaaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewAspect {

    @After("@annotation(MyMethodAnno)")
    public void afterAnnotatedMethod(JoinPoint jp){
        System.out.println("============== Test after pointcut for the methods annotated with @MyMethodAnno ===");
        System.out.println("intercepting method " + jp.getSignature());
        System.out.println("====================================================================================");
    }

    @Before(value = "within(SampleService)")
    public void beforeWithinService(JoinPoint jp) {
        System.out.println("**********************************");
        System.out.println("before method within class, method is "+ jp.getSignature());
        System.out.println("**********************************");

    }
    @Before(value = "target(com.mytests.spring.springbootjavaaop.SampleRepo)")
    public void beforeTargetRepo(JoinPoint jp) {
        System.out.println("**********************************");
        System.out.println("before repo method, method is "+ jp.getSignature());
        System.out.println("**********************************");

    }

}
