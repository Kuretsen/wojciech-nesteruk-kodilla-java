package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void addLog() {
        logger = Logger.INSTANCE;
        logger.log("Testing log");
    }
    @Test
    void testGetLastLog() {
        //Given

        //When
        String result = logger.getLastLog();

        //Then
        assertEquals("Testing log", result);
    }
}
