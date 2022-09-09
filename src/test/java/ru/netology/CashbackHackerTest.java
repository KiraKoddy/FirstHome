package ru.netology;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackerTest {
    CashbackHacker hack = new CashbackHacker();

    @Test
    public void CashbackHackService() {
        int actual = hack.remain(50);
        int expected = 950;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CashbackHackServiceMax() {
        int actual = hack.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}