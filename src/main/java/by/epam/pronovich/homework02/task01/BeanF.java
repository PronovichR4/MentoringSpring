package main.java.by.epam.pronovich.homework02.task01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanF {

    private String name;

    public void init(){
        System.out.println("Initialization");
    }

    public void destroy(){
        System.out.println("Destroy");
    }
}
