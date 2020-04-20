package main.java.by.epam.pronovich.task01.service;

import main.java.by.epam.pronovich.task01.entity.Company;
import main.java.by.epam.pronovich.task01.entity.Level;
import main.java.by.epam.pronovich.task01.entity.Position;

public class PositionService {

    private Company company;

    public void setCompany(Company company) {
        this.company = company;
    }

    public void updatePostion(Position position, Level level) {
        position.setLevel(level);
    }

    public void print(){
        System.out.println(company.toString());
    }
}
