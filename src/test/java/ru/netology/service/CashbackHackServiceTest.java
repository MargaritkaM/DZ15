package ru.netology.service;


import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void findBonusAmountMin() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void findBonusAmountMax() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void findBonusAmountError() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 1;

        assertEquals(expected, actual);
    }
}