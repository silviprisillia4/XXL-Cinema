package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class InputSeatTypeScreen {
    Controller c = new Controller();

    public InputSeatTypeScreen(Ticket ticket) {
        createInputSeatTypeScreen(ticket);
    }

    private void createInputSeatTypeScreen(Ticket ticket) {
        int confirm = c.getEmptyInt();

        confirm = JOptionPane.showConfirmDialog(null,
                "Apakah anda mau menentukan kursi sendiri?\n(YES untuk menentukan kursi sendiri, NO untuk mendapatkan rekomendasi kursi dari kami)",
                "XXL CINEMA", JOptionPane.YES_NO_OPTION);
        ticket.setPerson(Integer.parseInt(
                JOptionPane.showInputDialog(null, "Berapa ticket?", "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE)));

        if (c.isValidConfirmation(confirm)) {
            // manually
            new ManualSeatScreen(ticket);
        } else {
            // randomly
            new RandomSeatScreen(ticket);
        }
    }
}