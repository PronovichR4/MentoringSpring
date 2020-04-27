package main.java.by.epam.pronovich.homework02.task02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Position {

    private Map<Skill,Level> skills=new HashMap<>();
    private boolean available = true;
    private Employee employee;
    private Salary salary;
}
