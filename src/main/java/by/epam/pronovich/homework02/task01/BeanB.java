package main.java.by.epam.pronovich.homework02.task01;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanB {

    private String className;
    private BeanA beanA;
}
