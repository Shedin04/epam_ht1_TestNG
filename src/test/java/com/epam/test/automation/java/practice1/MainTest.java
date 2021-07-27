package com.epam.test.automation.java.practice1;

import org.testng.*;
import org.testng.annotations.Test;

public class MainTest {
    private int n;
    private int result;

    @Test
    public void test1Task1() {
        n = 4; result = 16;
        Assert.assertEquals(result, Main.task1(n));
    }
}
