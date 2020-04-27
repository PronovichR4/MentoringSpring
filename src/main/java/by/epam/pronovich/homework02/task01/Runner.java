package main.java.by.epam.pronovich.homework02.task01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("homework02/part01/Beans.xml");

        BeanA beanA = ctx.getBean("beanA", BeanA.class);
        System.out.println(beanA);

        BeanB beanB = ctx.getBean("beanB", BeanB.class);
        System.out.println(beanB);

        BeanC beanC = ctx.getBean("beanC",BeanC.class);
        System.out.println(beanC);

        BeanD dBean = beanC.getBeanD();
        BeanD dBean2 = beanC.getBeanD();

        System.out.println(dBean==dBean2);

        BeanE beanE = ctx.getBean("beanE", BeanE.class);
        System.out.println(beanE);
        beanE.printName();

        BeanF beanF = ctx.getBean("beanF", BeanF.class);
        System.out.println(beanF);



    }
}
