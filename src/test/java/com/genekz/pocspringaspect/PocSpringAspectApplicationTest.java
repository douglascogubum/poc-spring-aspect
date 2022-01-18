package com.genekz.pocspringaspect;

import com.genekz.pocspringaspect.service.Business1;
import com.genekz.pocspringaspect.service.Business2;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PocSpringAspectApplicationTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Business1 business1;
    @Autowired
    private Business2 business2;

    @Test
    void invokeAOPStuff() {
        log.info(business1.calculateSomething());
        log.info(business2.calculateSomething());
    }
}