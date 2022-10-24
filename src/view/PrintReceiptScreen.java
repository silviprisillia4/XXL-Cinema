package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class PrintReceiptScreen {
    Controller c = new Controller();

    public PrintReceiptScreen(Ticket ticket) {
        createPrintReceiptScreen(ticket);
    }

    private void createPrintReceiptScreen(Ticket ticket) {
        int confirm = c.getEmptyInt();

        // konfirmasi pembayaran
        confirm = JOptionPane.showConfirmDialog(null,
                "Silakan cek OVO/Gopay/Dana/LinkAja untuk melanjutkan pembayaran.", "XXL CINEMA",
                JOptionPane.YES_NO_OPTION);

        if (c.isValidConfirmation(confirm)) {
            // print bukti pembayaran (transaksi selesai)
            c.printReceipt(ticket);
        }
    }
}
