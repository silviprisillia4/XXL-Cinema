package test.java;

import org.junit.Assert;
import org.junit.Test;
import controller.*;

public class PaymentTest {
    Controller c = new Controller();

    @Test
    public void testOVOPaymentAboveBoundary() {
        double price = 200000;
        int payment = 1;

        double expected = 0.3;
        double actual = c.calculateDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testOVOPaymentBelowBoundary() {
        double price = 50000;
        int payment = 1;

        double expected = 1;
        double actual = c.calculateDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGoPayPaymentAboveBoundary() {
        double price = 200000;
        int payment = 2;

        double expected = 0.2;
        double actual = c.calculateDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGopayPaymentBelowBoundary() {
        double price = 50000;
        int payment = 2;

        double expected = 1;
        double actual = c.calculateDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testAnotherPaymentAboveBoundary() {
        double price = 200000;
        int payment = 3;

        double expected = 1;
        double actual = c.calculateDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testAnotherPaymentBelowBoundary() {
        double price = 50000;
        int payment = 4;

        double expected = 1;
        double actual = c.calculateDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }
}
