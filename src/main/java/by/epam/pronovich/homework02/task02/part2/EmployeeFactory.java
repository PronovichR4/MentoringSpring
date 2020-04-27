package main.java.by.epam.pronovich.homework02.task02.part2;

import lombok.Data;
import lombok.NoArgsConstructor;
import main.java.by.epam.pronovich.homework02.task02.entity.Employee;


@Data
@NoArgsConstructor
public class EmployeeFactory {

    private static Employee instance = new Employee();

    public Employee createInstance() {
        instance.setName("Volodya");
        instance.setAge(25);
        return instance;
    }
}
