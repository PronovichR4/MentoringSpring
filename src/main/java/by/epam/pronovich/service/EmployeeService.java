package main.java.by.epam.pronovich.service;

import main.java.by.epam.pronovich.entity.Company;
import main.java.by.epam.pronovich.entity.Employee;
import main.java.by.epam.pronovich.entity.Position;

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
