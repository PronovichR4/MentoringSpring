package main.java.by.epam.pronovich.task02;

import main.java.by.epam.pronovich.task02.entity.*;
import main.java.by.epam.pronovich.task02.service.EmployeeService;
import main.java.by.epam.pronovich.task02.service.PositionService;
import main.java.by.epam.pronovich.task02.service.SalaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static main.java.by.epam.pronovich.task02.entity.Level.MIDDLE;
import static main.java.by.epam.pronovich.task02.entity.Post.JAVA_DEVELOPER;

@Configuration
public class MyConfig {

    @Bean
    public Company company() {
        Company company = new Company();
        company.setName("Компания");
        return company;
    }

    @Bean
    public Salary salary() {
        return new Salary(520);
    }

    @Bean
    public SalaryService salaryService() {
        return new SalaryService();
    }

    @Bean
    public PositionService positionService() {
        return new PositionService();
    }

    @Bean
    EmployeeService employeeService() {
        return new EmployeeService();
    }

    @Bean
    public Employee employee() {
        return new Employee("Alex", 26);
    }

    @Bean
    public Position position() {
        return new Position(JAVA_DEVELOPER, MIDDLE);
    }

    @Bean
    public Currency currency() {
        return new Currency();
    }
}
