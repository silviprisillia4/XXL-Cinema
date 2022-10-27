package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class MainScreen {
    Controller c = new Controller();

    public MainScreen() {
        createMainScreen();
    }

    private void createMainScreen() {
        Ticket ticket = new Ticket();

        // welcome page
        JOptionPane.showMessageDialog(null, "Selamat datang di Pemesanan ticket Online XXL Cinema!", "XXL CINEMA",
                JOptionPane.INFORMATION_MESSAGE);

        // input date
        new InputDateScreen(ticket);

        // input theatre
        new InputTheatreScreen(ticket);

        // input movie
        new InputMovieScreen(ticket);

        // input seat type (manual/random)
        new InputSeatTypeScreen(ticket);

        // input metode pembayaran
        new InputPaymentScreen(ticket);

        // hitung harga ticket (sesuai tanggal)
        ticket.setPrice(c.getPriceByDate(ticket.getDate().getDateSubstring()));

        // hitung harga tiket * banyaknya orang
        ticket.setPrice(c.calculatePriceByPerson(ticket.getPrice(), ticket.getPerson()));

        // hitung harga ticket setelah diskon (sesuai metode pembayaran)
        ticket.setPrice(
                c.calculatePriceAfterDiscount(ticket.getPrice(),
                        ticket.getPayment().getSelectedPayment()));

        new PrintReceiptScreen(ticket);
    }
}
