package main.java.by.epam.pronovich.task01.service;

import main.java.by.epam.pronovich.task01.entity.Company;
import main.java.by.epam.pronovich.task01.entity.Employee;
import main.java.by.epam.pronovich.task01.entity.Position;

public class EmployeeService {

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

    public void upExperience(Employee employee){
        employee.setExperienceMonth(employee.getExperienceMonth()+1);
    }

    public void print(){
        System.out.println(company.toString());
    }
}
