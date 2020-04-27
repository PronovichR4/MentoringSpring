package main.java.by.epam.pronovich.homework02.task02.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {

    private String name;
    private List<Employee> employees = new LinkedList<>();
    private List<Position> positions = new LinkedList<>();

}
