package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void logLastLog(){
        Logger.getInstance().log("Last log");
    }
    @Test
    public void testGetLastLog() {
        String log = Logger.getInstance().getLastLog();

        Assert.assertEquals("Last log", log);
    }
}
