package main.java.by.epam.pronovich.homework02.task01;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanF){
            System.out.println("postProcessBeforeInitialization was called for: " + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanF){
            System.out.println("postProcessAfterInitialization was called for: " + beanName);
        }
        return bean;
    }
}
