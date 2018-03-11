package org.thymeleaf.spring.support;

import java.lang.annotation.*;

// thanks to http://blog.codeleak.pl/2013/11/thymeleaf-template-layouts-in-spring.html

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Layout
{
    String value() default "";
}