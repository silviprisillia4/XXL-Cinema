package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class ManualSeatScreen {
    Controller c = new Controller();

    public ManualSeatScreen(Ticket ticket) {
        createManualSeatScreen(ticket);
    }

    private void createManualSeatScreen(Ticket ticket) {
        int confirm;

        do {
            // menentukan baris sendiri
            confirm = c.getEmptyInt();

            do {
                ticket.getSeat().getSeats().removeAll(ticket.getSeat().getSeats());

                ticket.getSeat().setManualRow(JOptionPane.showInputDialog(null,
                        "Pilih baris kursi anda (A-L):\nA-D = barisan belakang, E-H = barisan tengah, I-L = barisan depan",
                        "XXL CINEMA", JOptionPane.YES_NO_OPTION).charAt(0));

                if (!c.isValidRow(ticket.getSeat().getManualRow())) {
                    JOptionPane.showMessageDialog(null,
                            "Baris yang diinput tidak ada!",
                            "XXL CINEMA", JOptionPane.YES_NO_OPTION);
                }
            } while (!c.isValidRow(ticket.getSeat().getManualRow()));

            // menentukan nomor sendiri
            do {
                ticket.getSeat().setManualNumber(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Pilih nomor kursi anda (1-18):\n1-6 = bagian kanan, 7-12 = bagian tengah, 13-18 = bagian kiri",
                        "XXL CINEMA", JOptionPane.YES_NO_OPTION)));

                if (!c.isValidNumber(ticket.getSeat().getManualNumber())) {
                    JOptionPane.showMessageDialog(null,
                            "Baris yang diinput tidak ada!",
                            "XXL CINEMA", JOptionPane.YES_NO_OPTION);
                }
            } while (!c.isValidNumber(ticket.getSeat().getManualNumber()));

            // menghitung kursi sesuai orang
            String seats = c.countManualSeat(ticket.getSeat().getSeats(),
                    ticket.getSeat().getManualRow(),
                    ticket.getSeat().getManualNumber(),
                    ticket.getPerson());

            // konfrimasi kursi
            confirm = JOptionPane.showConfirmDialog(null,
                    "Kursi yang anda pilih adalah" + seats
                            + ".\n(YES untuk lanjutkan, NO untuk pilih ulang kursi)",
                    "XXL CINEMA", JOptionPane.YES_NO_OPTION);

        } while (!c.isValidConfirmation(confirm));
    }
}