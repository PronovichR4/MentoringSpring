package main.java.by.epam.pronovich.homework02.task01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeanE {

    private String name;

    public void printName(){
        System.out.println("This className " +name);
    }
}
