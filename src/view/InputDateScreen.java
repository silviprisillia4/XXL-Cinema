package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class InputDateScreen {
    Controller c = new Controller();

    public InputDateScreen(Ticket ticket) {
        createInputDateScreen(ticket);
    }

    public void createInputDateScreen(Ticket ticket) {
        do {
            ticket.getDate()
                    .setDate(JOptionPane.showInputDialog(null, "Tanggal menonton yang diinginkan (DD/MM/YYYY) : ",
                            "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE));

            ticket.getDate().setDateSubstring(Integer.parseInt(ticket.getDate().getDate().substring(0, 2))); // (DD)
            ticket.getDate().setMonthSubstring(Integer.parseInt(ticket.getDate().getDate().substring(3, 5))); // (MM)
            ticket.getDate().setYearSubstring(Integer.parseInt(ticket.getDate().getDate().substring(6, 10))); // (YYYY)

            if (!c.isValidDate(ticket.getDate().getDateSubstring(),
                    ticket.getDate().getMonthSubstring(),
                    ticket.getDate().getYearSubstring())) {
                JOptionPane.showMessageDialog(null,
                        "Tanggal yang diinput salah!",
                        "XXL CINEMA", JOptionPane.YES_NO_OPTION);
            }
        } while (!c.isValidDate(ticket.getDate().getDateSubstring(),
                ticket.getDate().getMonthSubstring(),
                ticket.getDate().getYearSubstring()));
    }
}
