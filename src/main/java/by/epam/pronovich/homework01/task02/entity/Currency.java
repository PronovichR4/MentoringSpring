package main.java.by.epam.pronovich.homework01.task02.entity;

import org.springframework.stereotype.Component;

@Component
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
