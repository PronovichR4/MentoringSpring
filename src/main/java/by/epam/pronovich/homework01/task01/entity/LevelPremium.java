package main.java.by.epam.pronovich.homework01.task01.entity;

import java.util.HashMap;
import java.util.Map;

public final class LevelPremium {

    private static final int JUNIOR_PREMIUM = 0;
    private static final int MIDDLE_PREMIUM = 10;
    private static final int SENIOR_PREMIUM = 20;


    public static final Map<Level, Integer> premiumProcent = new HashMap<>();

    static {
        premiumProcent.put(Level.JUNIOR, JUNIOR_PREMIUM);
        premiumProcent.put(Level.MIDDLE, MIDDLE_PREMIUM);
        premiumProcent.put(Level.SENIOR, SENIOR_PREMIUM);
    }
}
