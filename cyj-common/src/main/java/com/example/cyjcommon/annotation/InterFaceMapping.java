package com.example.cyjcommon.annotation;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface InterFaceMapping {

    String name() default "";

    String path() default "";

    String method() default "";

    String api() default "";

    String service() default "";

    String description() default "";

    String version() default "1.0";

}
