package main.java.by.epam.pronovich.homework02.task01;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class CustomReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("This method was replaced");
        return null;
    }
}
