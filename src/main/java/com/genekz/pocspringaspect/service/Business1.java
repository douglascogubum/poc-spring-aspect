package com.genekz.pocspringaspect.service;

import com.genekz.pocspringaspect.aspect.TrackTime;
import com.genekz.pocspringaspect.repository.Dao1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Business1 {

    private final Dao1 dao1;

    @TrackTime
    public String calculateSomething() {
        String value = dao1.retrieveSomething();
        log.info("In Business - {}", value);
        return value;
    }
}
