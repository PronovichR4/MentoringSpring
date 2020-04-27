package main.java.by.epam.pronovich.homework02.task02.part2;


import lombok.Setter;
import main.java.by.epam.pronovich.homework02.task02.entity.Level;
import main.java.by.epam.pronovich.homework02.task02.entity.Position;
import main.java.by.epam.pronovich.homework02.task02.entity.Salary;
import main.java.by.epam.pronovich.homework02.task02.entity.Skill;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
@Setter
public class PositionFactory implements FactoryBean<Position> {

    private Skill skill;
    private Level level;
    private int salary;

    @Override
    public Position getObject() throws Exception {
        Position position = new Position();
        position.getSkills().put(skill, level);
        position.setSalary(new Salary(salary));
        return position;
    }

    @Override
    public Class<?> getObjectType() {
        return Position.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
