package main.java.by.epam.pronovich.homework02.task02.service;

import main.java.by.epam.pronovich.homework02.task02.entity.Company;
import main.java.by.epam.pronovich.homework02.task02.entity.Level;
import main.java.by.epam.pronovich.homework02.task02.entity.Position;
import main.java.by.epam.pronovich.homework02.task02.entity.Skill;

public class PositionService {

    private Company company;

    public void setCompany(Company company) {
        this.company = company;
    }

    public void updatePostion(Position position, Skill skill, Level level) {
        position.getSkills().put(skill, level);
    }

    public void removeSkill(Position position, Skill skill) {
        position.getSkills().remove(skill);
    }
}
