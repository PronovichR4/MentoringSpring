package main.java.by.epam.pronovich.homework01.task01.entity;

public class Salary {

    private int sizeBasicSalary;


    public Salary() {
    }

    public Salary(int sizeBasicSalary) {
        this.sizeBasicSalary = sizeBasicSalary;
    }

    public int getSizeBasicSalary() {
        return sizeBasicSalary;
    }

    public void setSizeBasicSalary(int sizeBasicSalary) {
        this.sizeBasicSalary = sizeBasicSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "sizeBasicSalary=" + sizeBasicSalary +
                '}';
    }
}
