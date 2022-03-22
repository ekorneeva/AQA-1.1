package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldCash500() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 500;


        int actual = cashbackHackerService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCash999() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 999;


        int actual = cashbackHackerService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash1000() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1000;


        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash1001() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 1001;


        int actual = cashbackHackerService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash10001() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 10001;


        int actual = cashbackHackerService.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash5000() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 5000;


        int actual = cashbackHackerService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCash50() {
        CashbackHackerService cashbackHackerService = new CashbackHackerService();
        int amount = 50;


        int actual = cashbackHackerService.remain(amount);
        int expected = 950;

        assertEquals(actual, expected);
    }
}