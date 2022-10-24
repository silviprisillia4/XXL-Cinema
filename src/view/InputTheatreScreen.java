package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class InputTheatreScreen {
    Controller c = new Controller();

    public InputTheatreScreen(Ticket ticket) {
        createInputTheatreScreen(ticket);
    }

    public void createInputTheatreScreen(Ticket ticket) {
        do {
            ticket.getTheatre().setSelectedTheatre(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Lokasi bioskop yang diinginkan (1-5) : \n1. BTL Mall \n2. Cimalk \n3. TSX Mall \n4. London van Java \n5. 24 Paskal",
                    "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE)));

            if (!c.isValidTheatre(ticket.getTheatre().getSelectedTheatre())) {
                JOptionPane.showMessageDialog(null,
                        "Lokasi bioskop yang diinput tidak ada!",
                        "XXL CINEMA", JOptionPane.YES_NO_OPTION);
            }
        } while (!c.isValidTheatre(ticket.getTheatre().getSelectedTheatre()));
    }
}
