package test.java;

import org.junit.Assert;
import org.junit.Test;
import controller.*;
import model.PaymentMethods;

public class PaymentTest {
    Controller c = new Controller();

    @Test
    public void testOVOPaymentAboveBoundary() {
        double price = 200000;
        int payment = PaymentMethods.OVO;

        double expected = 0.3;
        double actual = c.getDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testOVOPaymentBelowBoundary() {
        double price = 50000;
        int payment = PaymentMethods.OVO;

        double expected = 0;
        double actual = c.getDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGoPayPaymentAboveBoundary() {
        double price = 200000;
        int payment = PaymentMethods.GOPAY;

        double expected = 0.2;
        double actual = c.getDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testGopayPaymentBelowBoundary() {
        double price = 50000;
        int payment = PaymentMethods.GOPAY;

        double expected = 0;
        double actual = c.getDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testAnotherPaymentAboveBoundary() {
        double price = 200000;
        int payment = PaymentMethods.DANA;

        double expected = 0;
        double actual = c.getDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testAnotherPaymentBelowBoundary() {
        double price = 50000;
        int payment = PaymentMethods.LINKAJA;

        double expected = 0;
        double actual = c.getDiscountPercentageByPayment(price, payment);
        Assert.assertEquals(expected, actual, 0);
    }
}
