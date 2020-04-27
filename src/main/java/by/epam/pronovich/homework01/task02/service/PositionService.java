package main.java.by.epam.pronovich.homework01.task02.service;

import main.java.by.epam.pronovich.homework01.task02.entity.Company;
import main.java.by.epam.pronovich.homework01.task02.entity.Level;
import main.java.by.epam.pronovich.homework01.task02.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PositionService {

    @Autowired
    private Company company;

    public void setCompany(Company company) {
        this.company = company;
    }

    public void updatePostion(Position position, Level level) {
        position.setLevel(level);
    }

    public void print() {
        System.out.println(company.toString());
    }
}
