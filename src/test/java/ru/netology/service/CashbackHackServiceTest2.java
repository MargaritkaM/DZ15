package ru.netology.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest2 {

    @Test
    public void findBonusAmountMin() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void findBonusAmountMax() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void findBonusAmountError() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}