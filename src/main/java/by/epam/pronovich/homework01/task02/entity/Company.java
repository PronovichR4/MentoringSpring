package main.java.by.epam.pronovich.homework01.task02.entity;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component()
public class Company {

    private String name;
    private List<Employee> employees = new LinkedList<>();
    private List<Position> positions = new LinkedList<>();

    public Company() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                ", positions=" + positions +
                '}';
    }
}
