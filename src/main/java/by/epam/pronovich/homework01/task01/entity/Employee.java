package main.java.by.epam.pronovich.homework01.task01.entity;


import java.util.Objects;


public class Employee {

    private String name;
    private int age;
    private int experienceMonth;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperienceMonth() {
        return experienceMonth;
    }

    public void setExperienceMonth(int experienceMonth) {
        this.experienceMonth = experienceMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                experienceMonth == employee.experienceMonth &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, experienceMonth);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experienceMonth=" + experienceMonth +
                '}';
    }
}
