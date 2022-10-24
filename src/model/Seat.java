package model;

import java.util.ArrayList;

public class Seat {

    private ArrayList<String> seats = new ArrayList<>();
    private String row;
    private String number;
    private char manualRow;
    private int manualNumber;
    private char randomRow;
    private int randomNumber;

    public ArrayList<String> getSeats() {
        return seats;
    }

    public void setSeat(ArrayList<String> seats) {
        this.seats = seats;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public char getManualRow() {
        return manualRow;
    }

    public void setManualRow(char manualRow) {
        this.manualRow = manualRow;
    }

    public int getManualNumber() {
        return manualNumber;
    }

    public void setManualNumber(int manualNumber) {
        this.manualNumber = manualNumber;
    }

    public char getRandomRow() {
        return randomRow;
    }

    public void setRandomRow(char randomRow) {
        this.randomRow = randomRow;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

}
