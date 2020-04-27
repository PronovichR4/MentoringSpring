package main.java.by.epam.pronovich.homework02.task02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String name;
    private int age;
    private int experienceMonth;

    private static Employee employee = new Employee();

    public void init() {
        System.out.println("Initialization");
    }

    public void destroy() {
        System.out.println("Destroy");
    }

    public static Employee getInstance() {
        employee.setName("Vasyya");
        return employee;
    }


}
