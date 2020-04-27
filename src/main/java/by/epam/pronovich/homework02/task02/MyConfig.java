package main.java.by.epam.pronovich.homework02.task02;


import main.java.by.epam.pronovich.homework02.task02.entity.Position;
import main.java.by.epam.pronovich.homework02.task02.part2.PositionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static main.java.by.epam.pronovich.homework02.task02.entity.Level.MIDDLE;
import static main.java.by.epam.pronovich.homework02.task02.entity.Skill.DOTNET_DEVELOPER;

@Configuration
public class MyConfig {

    public PositionFactory positionFactory() {
        PositionFactory positionFactory = new PositionFactory();
        positionFactory.setSkill(DOTNET_DEVELOPER);
        positionFactory.setLevel(MIDDLE);
        return positionFactory;
    }

    @Bean
    public Position position() throws Exception{
       return positionFactory().getObject();
    }

}
