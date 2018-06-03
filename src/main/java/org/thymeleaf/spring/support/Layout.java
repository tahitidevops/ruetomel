package org.thymeleaf.spring.support;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// thanks to http://blog.codeleak.pl/2013/11/thymeleaf-template-layouts-in-spring.html

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Layout {

  /**
   * The name of the content to include in the layout.
   *
   * @return the name of the content to include in the layout.
   */
  String value() default "";
}