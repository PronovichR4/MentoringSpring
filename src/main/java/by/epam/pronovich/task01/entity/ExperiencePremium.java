package main.java.by.epam.pronovich.task01.entity;

import java.util.HashMap;
import java.util.Map;

public final class ExperiencePremium {

    private static final int NEW_EMPLOYEE = 0;
    private static final int SIX_MONTH_EXPIRIENC = 6;
    private static final int ONE_YEAR_EXPIRIENCE = 12;
    private static final int TWO_YEAR_EXPIRIENCE = 24;


    public final static Map<Integer, Integer> premiumProcent = new HashMap<>();

    static {
        premiumProcent.put(NEW_EMPLOYEE, 0);
        premiumProcent.put(SIX_MONTH_EXPIRIENC, 5);
        premiumProcent.put(ONE_YEAR_EXPIRIENCE, 10);
        premiumProcent.put(TWO_YEAR_EXPIRIENCE, 11);
    }
}
