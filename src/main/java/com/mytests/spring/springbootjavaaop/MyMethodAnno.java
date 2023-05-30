package com.mytests.spring.springbootjavaaop;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyMethodAnno {
}
