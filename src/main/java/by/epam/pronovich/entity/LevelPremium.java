package main.java.by.epam.pronovich.entity;

import java.util.HashMap;
import java.util.Map;

import static main.java.by.epam.pronovich.entity.Level.JUNIOR;
import static main.java.by.epam.pronovich.entity.Level.MIDDLE;
import static main.java.by.epam.pronovich.entity.Level.SENIOR;

public final class LevelPremium {

    private static final int JUNIOR_PREMIUM = 0;
    private static final int MIDDLE_PREMIUM = 10;
    private static final int SENIOR_PREMIUM = 20;


    public static final Map<Level, Integer> premiumProcent = new HashMap<>();

    static {
        premiumProcent.put(JUNIOR, JUNIOR_PREMIUM);
        premiumProcent.put(MIDDLE, MIDDLE_PREMIUM);
        premiumProcent.put(SENIOR, SENIOR_PREMIUM);
    }
}
