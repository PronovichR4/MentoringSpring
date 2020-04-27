package main.java.by.epam.pronovich.homework02.task02.service;


import lombok.NoArgsConstructor;
import main.java.by.epam.pronovich.homework02.task02.entity.*;

import java.util.Collection;
import java.util.Set;

@NoArgsConstructor
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

    public int calculateLevelPremiumProc(Position position) {
        int result = 0;
        Collection<Level> values = position.getSkills().values();
        for (Level value : values) {
            result = result + LevelPremium.premiumProcent.get(value);
        }
        return result;
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

    public void print() {
        System.out.println(currency.toString());
    }
}
