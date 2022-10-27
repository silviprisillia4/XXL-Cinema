package test.java;

import org.junit.Assert;
import org.junit.Test;
import controller.*;

public class DateTest {
    Controller c = new Controller();

    @Test
    public void testSpecialDate1() {
        int date = 9;

        int expected = 35000;
        int actual = c.getPriceByDate(date);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpecialDate2() {
        int date = 25;

        int expected = 40000;
        int actual = c.getPriceByDate(date);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testNotSpecialDate() {
        int date = 1;

        int expected = 50000;
        int actual = c.getPriceByDate(date);
        Assert.assertEquals(expected, actual);
    }

}