package com.genekz.pocspringaspect.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    @Around("@annotation(com.genekz.pocspringaspect.aspect.TrackTime)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        final long startTime = System.currentTimeMillis();

        Object object = joinPoint.proceed();

        final long timeTaken = System.currentTimeMillis() - startTime;
        log.info("Time Taken by {} is {}", joinPoint, timeTaken);
        return object;
    }
}
