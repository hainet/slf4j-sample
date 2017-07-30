package com.hainet.slf4j.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jSampleApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Slf4jSampleApplication.class);
        logger.info("Hello {}!", "hainet");
    }
}
