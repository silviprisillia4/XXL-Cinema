package model;

public class Payment  {

    private PaymentMethods selectedPayment;

    public PaymentMethods getSelectedPayment() {
        return selectedPayment;
    }

    public void setSelectedPayment(PaymentMethods selectedPayment) {
        this.selectedPayment = selectedPayment;
    }

}
