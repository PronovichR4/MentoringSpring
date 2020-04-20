package main.java.by.epam.pronovich.task01.entity;

public class Currency {

    private String usd = "USD";
    private String byn = "BYN";

    public String getUsd() {
        return usd;
    }

    public String getByn() {
        return byn;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "usd='" + usd + '\'' +
                ", byn='" + byn + '\'' +
                '}';
    }
}
