package main.java.by.epam.pronovich.task01.entity;

import java.util.Objects;

public class Position {

    private Post post;
    private Level level;
    private boolean available = true;
    private Employee employee;
    private Salary salary;

    public Position() {
    }

    public Position(Post post, Level level, boolean available, Employee employee, Salary salary) {
        this.post = post;
        this.level = level;
        this.available = available;
        this.employee = employee;
        this.salary = salary;
    }


    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return available == position.available &&
                post == position.post &&
                level == position.level &&
                Objects.equals(employee, position.employee) &&
                Objects.equals(salary, position.salary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(post, level, available, employee, salary);
    }

    @Override
    public String toString() {
        return "Position{" +
                "post=" + post +
                ", level=" + level +
                ", available=" + available +
                ", employee=" + employee +
                ", salary=" + salary +
                '}';
    }
}
