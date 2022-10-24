package model;

public class Ticket {
    private int person;
    private double price;
    private Date date = new Date();
    private Theatre theatre = new Theatre();
    private Movie movie = new Movie();
    private Seat seat = new Seat();
    private Payment payment = new Payment();

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public Movie getMovie() {
        return movie;
    }

    public Seat getSeat() {
        return seat;
    }

    public Payment getPayment() {
        return payment;
    }

}
