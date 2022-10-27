package test.java;

import org.junit.Assert;
import org.junit.Test;
import controller.*;

public class ValidateTest {
    Controller c = new Controller();

    @Test
    public void testValidDate() {
        int date = 22;
        int month = 10;
        int year = 2022;

        boolean expected = true;
        boolean actual = c.isValidDate(date, month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidDate() {
        int date = 32;
        int month = 10;
        int year = 2022;

        boolean expected = false;
        boolean actual = c.isValidDate(date, month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidMonth() {
        int date = 22;
        int month = 13;
        int year = 2022;

        boolean expected = false;
        boolean actual = c.isValidDate(date, month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidYear() {
        int date = 22;
        int month = 10;
        int year = 2031;

        boolean expected = false;
        boolean actual = c.isValidDate(date, month, year);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidTheatre() {
        int theatre = 4;

        boolean expected = true;
        boolean actual = c.isValidTheatre(theatre);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidTheatre() {
        int theatre = 0;

        boolean expected = false;
        boolean actual = c.isValidTheatre(theatre);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidMovie() {
        int movie = 7;

        boolean expected = true;
        boolean actual = c.isValidMovie(movie);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidMovie() {
        int movie = 15;

        boolean expected = false;
        boolean actual = c.isValidMovie(movie);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidRow() {
        char row = 'F';

        boolean expected = true;
        boolean actual = c.isValidRow(row);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidRow() {
        char row = 'Y';

        boolean expected = false;
        boolean actual = c.isValidRow(row);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidNumber() {
        int number = 12;

        boolean expected = true;
        boolean actual = c.isValidNumber(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidNumber() {
        int number = -2;

        boolean expected = false;
        boolean actual = c.isValidNumber(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidRowType() {
        String row = "depan";

        boolean expected = true;
        boolean actual = c.isValidRowType(row);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidRowType() {
        String row = "kanan";

        boolean expected = false;
        boolean actual = c.isValidRowType(row);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testValidPayment() {
        int payment = 1;

        boolean expected = true;
        boolean actual = c.isValidPayment(payment);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidPayment() {
        int payment = 5;

        boolean expected = false;
        boolean actual = c.isValidPayment(payment);
        Assert.assertEquals(expected, actual);
    }
}