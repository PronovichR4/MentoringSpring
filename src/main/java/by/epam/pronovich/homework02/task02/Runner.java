package main.java.by.epam.pronovich.homework02.task02;

import main.java.by.epam.pronovich.homework02.task02.entity.Employee;
import main.java.by.epam.pronovich.homework02.task02.entity.Position;
import main.java.by.epam.pronovich.homework02.task02.entity.Skill;
import main.java.by.epam.pronovich.homework02.task02.service.EmployeeService;
import main.java.by.epam.pronovich.homework02.task02.service.PositionService;
import main.java.by.epam.pronovich.homework02.task02.service.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static main.java.by.epam.pronovich.homework02.task02.entity.Level.MIDDLE;
import static main.java.by.epam.pronovich.homework02.task02.entity.Skill.JAVA_DEVELOPER;

public class Runner {


    public static void main(String[] args) {

        SalaryService salaryService = new SalaryService();
        PositionService positionService = new PositionService();
        EmployeeService employeeService = new EmployeeService();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("homework02/part02/beans.xml");

        Position positionWithMap = ctx.getBean("positionWithMap", Position.class);
        Employee volodya = ctx.getBean("secondEmpl", Employee.class);

        System.out.println(positionWithMap);

        employeeService.hireEmployee(volodya, positionWithMap);

        System.out.println(positionWithMap);

        salaryEmulator(salaryService,positionWithMap, JAVA_DEVELOPER,employeeService,positionService,14);
    }

    private static void salaryEmulator(SalaryService salaryService, Position position, Skill skil,
                                       EmployeeService employeeService, PositionService positionService, int period) {
        for (int i = 1; i <= period; i++) {
            if (i == 6) {
                positionService.updatePostion(position, skil, MIDDLE);
            }
            double salary = salaryService.calculateSalary(position);
            employeeService.upExperience(position.getEmployee());
            System.out.println("Зарлата за " + i + " месяц составила " + salary);
        }
    }
}


