package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackerServiceTest {

    @Test
    public void shouldCashBackHackerServiceReturn0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void shouldCashBackHackerServiceReturn1() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void shouldCashBackHackerServiceReturn999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void shouldCashBackHackerServiceReturn450() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(550);
        int expected = 450;
        Assert.assertEquals(actual, expected);
    }


}

