package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLessThanBoundary() {
        CashbackHackService testCashback = new CashbackHackService();

        int actual = testCashback.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemainEqualToBoundary() {
        CashbackHackService testCashback = new CashbackHackService();

        int actual = testCashback.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testRemainMoreThanBoundary() {
        CashbackHackService testCashback = new CashbackHackService();

        int actual = testCashback.remain(1001);
        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}