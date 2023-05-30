package com.mytests.spring.springbootjavaaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 5/25/2023.</p>
 * <p>Project: springboot-java-aop</p>
 * *
 */
@Aspect
//@Component
public class AspectInspectionsTest {

    @Around("execution(* *.*(..))") // Warning: Join point return value will be lost
    public void voidAround() {}
    @Around("execution(* *.*(..))") // Warning: Advice call cannot proceed: probably you forgot to declare a ProceedingJoinPoint parameter
    public Object noParamAround() {
        return "";
    }
    @Around("execution(* *.*(..))") // Warning: argNames attribute isn't defined
    public Object noArgNamesAround(ProceedingJoinPoint pjp, JoinPoint jp) throws Throwable {
        return pjp.proceed();
    }
    @Around("execution(* *.*(..))") // Error: Unbound pointcut parameter 'o'
    public Object noArgNamesAround(ProceedingJoinPoint pjp, Object o) throws Throwable {
        return pjp.proceed();
    }
    @Before(value = "execution(* *.*(..))", argNames = "o") // Error: Unbound pointcut parameter 'o'
    public void before1(Object o) {
        // ...
    }
    @Before(value = "execution(* *.*(..)) && args(s)", argNames = "s,o") // Error: Unbound pointcut parameter 'o'
    public void before2(String s, Object o) {
        // ...
    }
}
