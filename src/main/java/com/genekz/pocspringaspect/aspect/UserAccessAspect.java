package com.genekz.pocspringaspect.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class UserAccessAspect {

    @Before("execution(* com.genekz.pocspringaspect.repository.*.*(..))")
    public void before(JoinPoint joinPoint) {
        log.info(" Check for user access");
        log.info(" Allowed execution for {}", joinPoint);
    }
}
