package controller;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import model.*;

public class Controller {

    public String getEmptyString() {
        return "";
    }

    public int getEmptyInt() {
        return 0;
    }

    public int convertDoubleToInt(Double d) {
        return d.intValue();
    }

    public boolean isValidConfirmation(int confirm) {
        if (confirm == JOptionPane.YES_OPTION) {
            return true;
        }
        return false;
    }

    public boolean isValidDate(int date, int month, int year) {
        if (date >= 1 && date <= 31 && month >= 1 && month <= 12 && year >= 2022 && year <= 2030) {
            return true;
        }
        return false;
    }

    public boolean isValidTheatre(int theatre) {
        if (theatre >= 1 && theatre <= 5) {
            return true;
        }
        return false;
    }

    public boolean isValidMovie(int movie) {
        if (movie >= 1 && movie <= 10) {
            return true;
        }
        return false;
    }

    public boolean isValidRow(char manualRow) {
        char[] seatChar = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L' };

        for (char element : seatChar) {
            if (element == manualRow) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidNumber(int manualNumber) {
        if (manualNumber >= 1 && manualNumber <= 18) {
            return true;
        }
        return false;
    }

    public boolean isValidRowType(String row) {
        String[] seatString = { "depan", "tengah", "belakang" };

        for (String element : seatString) {
            if (element == row) {
                return true;
            }
        }

        return false;
    }

    public boolean isValidPayment(int payment) {
        if (payment >= 1 && payment <= 4) {
            return true;
        }
        return false;
    }

    public boolean isValidBoundary(int value, int boundary1, int boundary2) {
        return value < boundary1 && value > boundary2;
    }

    public String chooseShowTime(Movie movie) {
        String time = getEmptyString();

        switch (movie.getSelectedMovie()) {
            case 1:
            case 2:
                time = movie.getShowTimes()[0];
                break;
            case 3:
            case 4:
                time = movie.getShowTimes()[1];
                break;
            case 5:
            case 6:
                time = movie.getShowTimes()[2];
                break;
            case 7:
            case 8:
                time = movie.getShowTimes()[3];
                break;
            case 9:
            case 10:
                time = movie.getShowTimes()[4];
                break;
            default:
                time = "";
                break;
        }
        return time;
    }

    public String countManualSeat(ArrayList<String> seats, int manualRow, int manualNumber, int person) {
        int numberTemp = manualNumber;
        String seatTemp = getEmptyString();
        for (int i = 0; i < person; i++) {
            seatTemp = manualRow + "" + numberTemp;
            seats.add(seatTemp);
            if (manualNumber + person > 18) {
                numberTemp--;
            } else {
                numberTemp++;
            }
        }
        return concatenateSeat(seats);
    }

    public String countRandomSeat(ArrayList<String> seats, int randomRow, int randomNumber, int person) {
        int numberTemp = randomNumber;
        String seatTemp = getEmptyString();
        for (int i = 0; i < person; i++) {
            seatTemp = randomRow + "" + numberTemp;
            seats.add(seatTemp);
            if (randomNumber + person > 18) {
                numberTemp--;
            } else {
                numberTemp++;
            }
        }
        return concatenateSeat(seats);
    }

    public char randomizeSeatRow(String row) {
        Random r = new Random(); // random dengan java.util.Random
        char randomRow;
        String kursi = getEmptyString();

        switch (row) {
            case "depan":
                kursi = "IJKL";
                break;
            case "tengah":
                kursi = "EFGH";
                break;
            case "belakang":
                kursi = "ABCD";
                break;
        }
        randomRow = kursi.charAt(r.nextInt(kursi.length()));
        return randomRow;
    }

    public int randomizeSeatNumber(String number) {
        int randomNumber = getEmptyInt();
        boolean valid = false;
        int leftBoundary1 = 13;
        int leftBoundary2 = 18;
        int centerBoundary1 = 7;
        int centerBoundary2 = 12;
        int rightBoundary1 = 1;
        int rightBoundary2 = 6;
        do {
            randomNumber = convertDoubleToInt(Math.random() * 18); // random dengan Math.random
            switch (number) {
                case "kiri":
                    // cek < 13 dan > 18
                    valid = isValidBoundary(randomNumber, leftBoundary1, leftBoundary2);
                    break;
                case "tengah":
                    // cek < 7 dan > 12
                    valid = isValidBoundary(randomNumber, centerBoundary1, centerBoundary2);
                    break;
                case "kanan":
                    // cek < 1 dan > 6
                    valid = isValidBoundary(randomNumber, rightBoundary1, rightBoundary2);

            }
        } while (!valid);
        return randomNumber;
    }

    public int getPriceByDate(int date) {
        int[] specialDate1 = { 4, 9 };
        int[] specialDate2 = { 2, 25, 29 };
        int price = 50000;

        for (int element : specialDate1) {
            if (element == date) {
                price = 35000;
                break;
            }
        }

        for (int element : specialDate2) {
            if (element == date) {
                price = 40000;
                break;
            }
        }
        return price;
    }

    public double calculatePriceByPerson(double price, int person) {
        return price * person;
    }

    public double getDiscountPercentageByPayment(double price, int selectedPayment) {
        int priceBoundary = 100000;
        double ovoDiscount = 0.3;
        double gopayDiscount = 0.2;
        double noDiscount = 0;
        if (selectedPayment == PaymentMethods.OVO && price >= priceBoundary) {
            return ovoDiscount;
        } else if (selectedPayment == PaymentMethods.GOPAY && price >= priceBoundary) {
            return gopayDiscount;
        }
        return noDiscount;
    }

    public double calculatePriceAfterDiscount(double price, int selectedPayment) {
        double discount = getDiscountPercentageByPayment(price, selectedPayment);
        return price -= price * discount;
    }

    public String concatenateSeat(ArrayList<String> seats) {
        String seatTemp = getEmptyString();
        for (String seat : seats) {
            seatTemp += " " + seat;
        }
        return seatTemp;
    }

    public void printReceipt(Ticket ticket) {
        JOptionPane.showMessageDialog(null, "Simpan bukti pembayaran ini untuk ditukarkan dengan tiket\n"
                + "\nTanggal menonton: " + ticket.getDate().getDate() + ""
                + "\nLokasi bioskop: "
                + ticket.getTheatre().getTheatres()[ticket.getTheatre().getSelectedTheatre() - 1] + ""
                + "\nFilm: " + ticket.getMovie().getMovies()[ticket.getMovie().getSelectedMovie() - 1] + ""
                + "\nWaktu: " + ticket.getMovie().getTime() + ""
                + "\nKursi:" + concatenateSeat(ticket.getSeat().getSeats()) + " (" + ticket.getPerson() + " tiket)"
                + "\nMetode pembayaran: "
                + ticket.getPayment().getPayment() + ""
                + "\nTotal bayar: " + String.format("%.0f", ticket.getPrice()) + "\n" // harga setelah
                                                                                      // diskon
                + "\nSUDAH LUNAS", "XXL CINEMA", JOptionPane.INFORMATION_MESSAGE);
    }
}