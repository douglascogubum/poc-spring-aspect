package com.genekz.pocspringaspect.service;

import com.genekz.pocspringaspect.repository.Dao1;
import com.genekz.pocspringaspect.repository.Dao2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Business2 {

    private final Dao2 dao2;

    public String calculateSomething() {
        return dao2.retrieveSomething();
    }
}
