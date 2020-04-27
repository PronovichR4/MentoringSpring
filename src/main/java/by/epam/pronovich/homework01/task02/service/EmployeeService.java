package main.java.by.epam.pronovich.homework01.task02.service;

import main.java.by.epam.pronovich.homework01.task02.entity.Company;
import main.java.by.epam.pronovich.homework01.task02.entity.Employee;
import main.java.by.epam.pronovich.homework01.task02.entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

@Autowired
    private Company company;

    public void setCompany(Company company) {
        this.company = company;
    }

    public void hireEmployee(Employee employee, Position position) {
        if (position.isAvailable()) {
            position.setEmployee(employee);
            position.setAvailable(false);
        }
    }

    public void fireEmployee(Position position) {
        position.setEmployee(null);
        position.setAvailable(true);
    }

    public void upExperience(Employee employee) {
        employee.setExperienceMonth(employee.getExperienceMonth() + 1);
    }

    public void print() {
        System.out.println(company.toString());
    }
}
