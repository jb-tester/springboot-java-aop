package com.mytests.spring.springbootjavaaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 5/24/2023.</p>
 * <p>Project: springboot-java-aop</p>
 * *
 */
@Aspect
@Component
public class SampleAspect {



    @Pointcut("execution(* com.mytests.spring.springbootjavaaop.SampleRepo.*(..))")
    public void repositoryMethodsPointcut() {
        // No code required here
    }

    @Pointcut("execution(* com.mytests.spring.springbootjavaaop.SampleService.*(..))")
    public void serviceMethodsPointcut() {
        // No code required here
    }
    @Pointcut("execution(* *..find*(String)) || execution(* *..display*(String))")
    public void methodByNamePatternAndParam(){

    }
    // !!! Advised methods are not found !!!
    @Around("repositoryMethodsPointcut())")
    public Object aroundRepoMethodExecution(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("============== Test around pointcut for the repo methods =============");
        System.out.println("intercepting repository method "+jp.getSignature());
        System.out.println("======================================================================");
        return jp.proceed();
    }

    @Before("serviceMethodsPointcut()")
    public void beforeServiceMethodExecution(JoinPoint jp) {
        System.out.println("============== Test before pointcut for the service methods ==========");
        System.out.println("intercepting service method "+jp.getSignature());
        System.out.println("======================================================================");
    }
    @After("methodByNamePatternAndParam()")
    public void afterPatternMethod(JoinPoint jp){
        System.out.println("**********************************");
        System.out.println("patern!!! " + jp.getSignature());
        System.out.println("**********************************");
    }
}
