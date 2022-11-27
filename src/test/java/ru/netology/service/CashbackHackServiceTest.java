package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCashBackHackerServiceReturn0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackHackerServiceReturn1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackHackerServiceReturn550() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(450);
        int expected = 550;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashBackHackerServiceReturn1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackHackerServiceReturn999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCashBackHackerServiceReturn998() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2);
        int expected = 998;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCashBackHackerServiceReturn8() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(992);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCashBackHackerServiceReturn500() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCashBackHackerService0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(expected, actual);
    }



}
