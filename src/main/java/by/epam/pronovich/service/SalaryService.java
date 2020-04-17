package main.java.by.epam.pronovich.service;

import main.java.by.epam.pronovich.entity.*;
import java.util.Set;

public class SalaryService {

    private Currency currency;

    public SalaryService(Currency currency) {
        this.currency = currency;
    }

    public double calculateSalary(Position position) {
        int allPremiumProcent = calculateExperiencePremiumProc(position) + calculateLevelPremiumProc(position);
        int sizeBasicSalary = position.getSalary().getSizeBasicSalary();
        double v = sizeBasicSalary / 100.0 * allPremiumProcent;
        double salary = v + sizeBasicSalary;
        return salary;

    }

    private int calculateLevelPremiumProc(Position position) {
        return LevelPremium.premiumProcent.get(position.getLevel());
    }

    private int calculateExperiencePremiumProc(Position position) {
        Set<Integer> keys = ExperiencePremium.premiumProcent.keySet();
        int experienceMonth = position.getEmployee().getExperienceMonth();
        int exp = 0;
        for (Integer key : keys) {
            if (experienceMonth < key) {
                continue;
            } else {
                if (exp <= key) {
                    exp = key;
                }
            }
        }
        return ExperiencePremium.premiumProcent.get(exp);
    }

    public void print(){
        System.out.println(currency.toString());
    }
}
