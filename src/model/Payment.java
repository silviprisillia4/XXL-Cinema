package model;

public class Payment {

    private String payment;
    private int selectedPayment;

    public void setPayment(String payment) {
        this.payment = payment;
    }
    public String getPayment() {
        return payment;
    }

    public int getSelectedPayment() {
        return selectedPayment;
    }

    public void setSelectedPayment(int selectedPayment) {
        this.selectedPayment = selectedPayment;
    }

}
