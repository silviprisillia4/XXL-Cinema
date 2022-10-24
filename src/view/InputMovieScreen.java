package view;

import javax.swing.JOptionPane;

import model.*;
import controller.*;

public class InputMovieScreen {
    Controller c = new Controller();

    public InputMovieScreen(Ticket ticket) {
        createInputMovieScreen(ticket);
    }

    public void createInputMovieScreen(Ticket ticket) {
        int confirm = c.getEmptyInt();

        do {
            do {
                ticket.getMovie().setSelectedMovie(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Film yang diinginkan (1-10) : \n1. Habibie & Ainun 3 \n2. Dilan 1990 \n3. Dua Garis Biru \n4. Ghost Writer \n5. Mulan \n6. Aladdin \n7. Spiderman: Far From Home \n8. It: Chapter 2 \n9. Men In Black: International \n10. Joker",
                        "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE)));
                if (!c.isValidMovie(ticket.getMovie().getSelectedMovie())) {
                    JOptionPane.showMessageDialog(null,
                            "Film yang diinput tidak ada!",
                            "XXL CINEMA", JOptionPane.YES_NO_OPTION);
                }
            } while (!c.isValidMovie(ticket.getMovie().getSelectedMovie()));

            confirm = JOptionPane.showConfirmDialog(null,
                    ticket.getMovie().getMovies()[ticket.getMovie().getSelectedMovie() - 1] + "\n"
                            + ticket.getMovie().getGenres()[ticket.getMovie().getSelectedMovie() - 1]
                            + "\n\n" + ticket.getMovie().getSynopsis()[ticket.getMovie().getSelectedMovie() - 1]
                            + "\n\nPilih film ini?",
                    "XXL CINEMA", JOptionPane.YES_NO_OPTION);
        } while (!c.isValidConfirmation(confirm));

        ticket.getMovie().setTime(c.chooseShowTime(ticket.getMovie()));
    }
}