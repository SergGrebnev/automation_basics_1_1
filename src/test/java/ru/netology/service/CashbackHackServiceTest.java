package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainMoreThanBoundary() {
        CashbackHackService testCashback = new CashbackHackService();

        int actual = testCashback.remain(1001);
        int expected = 999;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemainLessThanBoundary() {
        CashbackHackService testCashback = new CashbackHackService();

        int actual = testCashback.remain(999);
        int expected = 1;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testRemainEqualToBoundary() {
        CashbackHackService testCashback = new CashbackHackService();

        int actual = testCashback.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }
}