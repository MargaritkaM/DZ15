package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void test() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(100);
        int expected = 900;

        assertEquals(expected, actual);
    }
    @Test
    void test2() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }


}