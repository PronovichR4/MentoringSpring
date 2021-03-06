package main.java.by.epam.pronovich.homework01.task02.entity;

import java.util.HashMap;
import java.util.Map;

import static main.java.by.epam.pronovich.homework01.task02.entity.Post.*;

public final class PostSalary {

    public final static Map<Post, Integer> postBasicSalary = new HashMap<>();

    static {
        postBasicSalary.put(JAVA_DEVELOPER, 500);
        postBasicSalary.put(JAVASCRIPT_DEVELOPER, 470);
        postBasicSalary.put(PYTHON_DEVELOPER, 450);
        postBasicSalary.put(DOTNET_DEVELOPER, 400);
    }
}
