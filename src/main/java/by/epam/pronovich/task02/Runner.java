package main.java.by.epam.pronovich.task02;


import main.java.by.epam.pronovich.task02.entity.Employee;
import main.java.by.epam.pronovich.task02.entity.Position;
import main.java.by.epam.pronovich.task02.service.EmployeeService;
import main.java.by.epam.pronovich.task02.service.PositionService;
import main.java.by.epam.pronovich.task02.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static main.java.by.epam.pronovich.task02.entity.Level.SENIOR;


public class Runner {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        EmployeeService employeeService = ctx.getBean(EmployeeService.class);
        SalaryService salaryService = ctx.getBean(SalaryService.class);
        PositionService positionService = ctx.getBean(PositionService.class);

        Employee employee = ctx.getBean(Employee.class);
        Position position = ctx.getBean(Position.class);

        employeeService.hireEmployee(employee, position);

        salaryEmulator(salaryService,position,employeeService,positionService,13);
    }

    private static void salaryEmulator(SalaryService salaryService, Position position, EmployeeService employeeService,
                                      PositionService positionService, int period) {
        for (int i = 1; i <= period; i++) {
            if (i == 10) {
                positionService.updatePostion(position, SENIOR);
            }
            double salary = salaryService.calculateSalary(position);
            employeeService.upExperience(position.getEmployee());
            System.out.println("Зарлата за " + i + " месяц составила " + salary);
        }


    }
}


