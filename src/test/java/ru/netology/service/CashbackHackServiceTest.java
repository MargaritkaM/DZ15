package ru.netology.service;


import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void findBonusAmountMin() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void findBonusAmountMax() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void findBonusAmountError() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}