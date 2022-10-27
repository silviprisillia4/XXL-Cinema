package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class InputPaymentScreen {
    Controller c = new Controller();

    public InputPaymentScreen(Ticket ticket) {
        createInputPaymentScreen(ticket);
    }

    private void createInputPaymentScreen(Ticket ticket) {
        do {
            ticket.getPayment().setSelectedPayment(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Metode pembayaran (1-4) :\n1. OVO (diskon 30%*)\n2. Gopay (diskon 20%*)\n3. Dana\n4. LinkAja\n*diskon berlaku minimal pembelian 100000",
                    "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE)));
            if (c.isValidPayment(ticket.getPayment().getSelectedPayment())) {
                switch (ticket.getPayment().getSelectedPayment()) {
                    case 1:
                        ticket.getPayment().setPayment("OVO");
                        break;
                    case 2:
                        ticket.getPayment().setPayment("GOPAY");
                        break;
                    case 3:
                        ticket.getPayment().setPayment("Dana");
                        break;
                    case 4:
                        ticket.getPayment().setPayment("Link Aja");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null,
                    "Payment yang diinput tidak ada!",
                    "XXL CINEMA", JOptionPane.YES_NO_OPTION);
            }
            
        } while (!c.isValidPayment(ticket.getPayment().getSelectedPayment()));

    }
}