package main.java.by.epam.pronovich.service;

import main.java.by.epam.pronovich.entity.Company;
import main.java.by.epam.pronovich.entity.Level;
import main.java.by.epam.pronovich.entity.Position;
import main.java.by.epam.pronovich.entity.Post;

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
