package model;

public class Theatre {
    private String[] theatres = new String[] { "BTL Mall", "Cimalk", "TSX Mall", "London van Java", "24 Paskal" };
    private int selectedTheatre;

    public String[] getTheatres() {
        return theatres;
    }

    public int getSelectedTheatre() {
        return selectedTheatre;
    }

    public void setSelectedTheatre(int selectedTheatre) {
        this.selectedTheatre = selectedTheatre;
    }
}
