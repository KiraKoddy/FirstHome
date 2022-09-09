package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    CashbackHacker hacker = new CashbackHacker();

    @Test
    public void cashbackTest() {

        int actual = hacker.remain(100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void cashbackTestMax() {
        int actual = hacker.remain(1000);

        int expected = 0;

        Assert.assertEquals(actual, expected);

    }
}