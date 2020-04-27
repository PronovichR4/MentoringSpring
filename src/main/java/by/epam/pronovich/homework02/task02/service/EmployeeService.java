package main.java.by.epam.pronovich.homework02.task02.service;

import lombok.Setter;
import main.java.by.epam.pronovich.homework02.task02.entity.Company;
import main.java.by.epam.pronovich.homework02.task02.entity.Employee;
import main.java.by.epam.pronovich.homework02.task02.entity.Position;

@Setter
public class EmployeeService {

    private Company company;

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
}
