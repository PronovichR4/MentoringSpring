package main.java.by.epam.pronovich.task01;

import main.java.by.epam.pronovich.task01.service.EmployeeService;
import main.java.by.epam.pronovich.task01.service.PositionService;
import main.java.by.epam.pronovich.task01.service.SalaryService;
import main.java.by.epam.pronovich.task01.entity.Position;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static main.java.by.epam.pronovich.task01.entity.Level.SENIOR;

public class Runner {


    public static void main(String[] args) {

        ApplicationContext ctxService = new ClassPathXmlApplicationContext("task01/Services.xml");
        ApplicationContext ctxPos = new ClassPathXmlApplicationContext("task01/Position.xml");

        EmployeeService employeeService = ctxService.getBean("employeeService", EmployeeService.class);
        PositionService positionService = ctxService.getBean("positionService", PositionService.class);
        SalaryService salaryService = ctxService.getBean("salaryService", SalaryService.class);

        Position posJava = ctxPos.getBean("javaJun", Position.class);

          salaryEmulator(salaryService,posJava,employeeService,positionService,13);

        System.out.println(posJava.getEmployee().toString());

    }

    public static void salaryEmulator(SalaryService salaryService, Position position, EmployeeService employeeService,
                                      PositionService positionService,int period) {
        for (int i = 1; i <= period; i++) {
            if(i==10){
                positionService.updatePostion(position, SENIOR);
            }
            double salary = salaryService.calculateSalary(position);
            employeeService.upExperience(position.getEmployee());
            System.out.println("Зарлата за " + i + " месяц составила " + salary);
        }
    }

}
