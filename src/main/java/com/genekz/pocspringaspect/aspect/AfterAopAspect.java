package com.genekz.pocspringaspect.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class AfterAopAspect {

    @AfterReturning(value = "execution(* com.genekz.pocspringaspect.service.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        log.info("{} returned with value {}", joinPoint, result);
    }

    @After(value = "execution(* com.genekz.pocspringaspect.service.*.*(..))")
    public void after(JoinPoint joinPoint) {
        log.info("After execution of {}", joinPoint);
    }
}
