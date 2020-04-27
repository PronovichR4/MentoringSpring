package main.java.by.epam.pronovich.homework01.task02.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Position {

    private Post post;
    private Level level;
    private boolean available = true;

    private Employee employee;
    @Autowired
    private Salary salary;

    public Position() {
    }

    public Position(Post post, Level level) {
        this.post = post;
        this.level = level;
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
                "skill=" + post +
                ", level=" + level +
                ", available=" + available +
                ", employee=" + employee +
                ", salary=" + salary +
                '}';
    }
}
