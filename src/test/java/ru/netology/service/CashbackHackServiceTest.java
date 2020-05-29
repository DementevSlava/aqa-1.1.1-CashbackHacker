package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @org.testng.annotations.Test
    public void Rerutn1000IfAmountIsZero() {
        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void buyUpTo1000 () {
        int amount = 700;

        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void buyOnTheBoundary () {
        int amount = 999;

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void buyTo1000 () {
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void buyAfterTheBoundary () {
        int amount = 1001;

        int actual = cashbackHackService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void NegativeAmount () {
        int amount = -1;

        int actual = cashbackHackService.remain(amount);
        int expected = 1001;

        assertEquals(actual, expected);
    }
}