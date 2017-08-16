package com.hainet.slf4j.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class Slf4jSampleApplication {

    private final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        logger.info("Hello {}!", "hainet");
        logger.info("Hello Throwable!", new RuntimeException("This is RuntimeException!"));
        logger.info("{} / \\{}", "Replaced!");
    }
}
