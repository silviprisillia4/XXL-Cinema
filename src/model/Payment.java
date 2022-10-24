package model;

public class Payment {

    private String[] payments = { "OVO", "GoPay", "Dana", "LinkAja" };
    private int selectedPayment;

    public String[] getPayments() {
        return payments;
    }

    public int getSelectedPayment() {
        return selectedPayment;
    }

    public void setSelectedPayment(int selectedPayment) {
        this.selectedPayment = selectedPayment;
    }

}
