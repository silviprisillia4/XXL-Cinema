package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class RandomSeatScreen {
    Controller c = new Controller();

    public RandomSeatScreen(Ticket ticket) {
        createRandomSeatScreen(ticket);
    }

    private void createRandomSeatScreen(Ticket ticket) {
        int confirm = c.getEmptyInt();

        // menentukan baris random
        do {
            ticket.getSeat().setRow(JOptionPane.showInputDialog(null,
                    "Pilih baris kursi anda (depan/tengah/belakang):\nA-D = barisan belakang, E-H = barisan tengah, I-L = barisan depan",
                    "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE));

            if (!c.isValidRowType(ticket.getSeat().getRow())) {
                JOptionPane.showMessageDialog(null,
                        "Baris yang diinput tidak ada!",
                        "XXL CINEMA", JOptionPane.YES_NO_OPTION);
            }
        } while (!c.isValidRowType(ticket.getSeat().getRow()));

        // menentukan nomor random
        do {
            ticket.getSeat().setNumber(JOptionPane.showInputDialog(null,
                    "Pilih nomor kursi anda (kiri/tengah/kanan):\n1-6 = bagian kanan, 7-12 = bagian tengah, 13-18 = bagian kiri",
                    "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE));

            if (!c.isValidRowType(ticket.getSeat().getRow())) {
                JOptionPane.showMessageDialog(null,
                        "Baris yang diinput tidak ada!",
                        "XXL CINEMA", JOptionPane.YES_NO_OPTION);
            }
        } while (!c.isValidRowType(ticket.getSeat().getRow()));

        // mengacak baris dan nomor di function
        do {
            ticket.getSeat().setRandomRow(c.randomizeSeatRow(ticket.getSeat().getRow()));
            ticket.getSeat().setRandomNumber(c.randomizeSeatNumber(ticket.getSeat().getNumber()));

            String seats = c.countRandomSeat(ticket.getSeat().getSeats(),
                    ticket.getSeat().getRandomRow(),
                    ticket.getSeat().getRandomNumber(),
                    ticket.getPerson());

            // konfrimasi kursi
            confirm = JOptionPane.showConfirmDialog(null,
                    "Kursi yang anda pilih adalah" + seats
                            + ".\n(YES untuk lanjutkan, NO untuk pilih ulang kursi)",
                    "XXL CINEMA", JOptionPane.YES_NO_OPTION);

        } while (!c.isValidConfirmation(confirm));
    }
}